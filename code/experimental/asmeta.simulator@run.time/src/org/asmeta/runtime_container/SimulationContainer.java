package org.asmeta.runtime_container;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.EmptyStackException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

import org.asmeta.animator.MyState;
import org.asmeta.parser.ASMParser;
import org.asmeta.parser.ParseException;
import org.asmeta.parser.util.AsmPrinter;
import org.asmeta.runtime_simulator.AsmetaSservice;
import org.asmeta.runtime_simulator.IdNotFoundException;
import org.asmeta.runtime_simulator.InfoAsmetaService;
import org.asmeta.simulator.InvalidInvariantException;
import org.asmeta.simulator.Location;
import org.asmeta.simulator.State;
import org.asmeta.simulator.UpdateClashException;

import org.asmeta.simulator.main.*;
import org.asmeta.simulator.util.InputMismatchException;
import org.asmeta.simulator.util.MonitoredFinder;
import org.asmeta.simulator.value.Value;

import asmeta.AsmCollection;
import asmeta.definitions.Invariant;
import asmeta.definitions.Property;
import asmeta.definitions.impl.MonitoredFunctionImpl;
import asmeta.structure.Asm;
import asmeta.structure.Body;
import asmeta.terms.basicterms.Term;


/**
 * The Class  SimulationContainer. 
 * It is a container for managing the execution of an ASM model at runtime.
 * It provides methods for instantiating, starting, running and stopping a model execution
 */
public class SimulationContainer implements IModelExecution, IModelAdaptation {
    
	private int id; // returning the id of the simulator generated if everything goes welcl

	/** The ids. */
	private int ids; //the id for the method start to check if is full o not

	/** The asm S. */
	static AsmetaSservice asmS = AsmetaSservice.getInstance();

	/** The instance. */
	private static SimulationContainer instance = null;

	/** The ms. */
	MyState ms;
	
	/** The status of the simulator, used to check when to update the model. */
	SimStatus simulationRunning = SimStatus.PAUSE;
	/** The status of timeout methods rollback, used to check if it has already been done or is needed. */
	rollbackStatus rollbStatus = rollbackStatus.NOTROLLED;
	
	private static int stepRun = 0;

	private long startRun = 0L;
	private long endRun = 0L;
	private long duration = 0L;
	
	private List<String> invarNames;
	//private List<String> variables;
	
	private RunOutput routTO=null;	//support variable for the timeout methods



	/**
	 * Gets the single instance of ImpModelExecute.
	 *
	 * @return single instance of ImpModelExecute
	 */
	public static SimulationContainer getInstance() {
		if (instance == null)
			instance = new SimulationContainer();
		return instance;
	}



	/**
	 * return the id of the simulator if the simulator is full return -1;.
	 *
	 * @param modelPath the model path
	 * @return the int
	 */
	public int startExecution(String modelPath) {
		StartOutput sout = null;
		try {
			id = asmS.start(modelPath);
			ids = checkStartId(id);

			sout = new StartOutput(ids, "The id " + ids + " is successfully created");
			System.out.println(sout.toString());

		} catch (Exception e) {
			if (e instanceof MainRuleNotFoundException) {
				sout = new StartOutput(-2, "Main Rule Not Found");
				System.err.println(sout.toString());

			} else if (e instanceof AsmModelNotFoundException) {
				sout = new StartOutput(-3,
						"The Model " + modelPath.substring(modelPath.lastIndexOf("/") + 1) + " Doesn't esist");
				System.err.println(sout.toString());

			} else if (e instanceof FullMapException) {
				sout = new StartOutput(-4, "The simulator map is Full " + "can't add the model <"
						+ modelPath.substring(modelPath.lastIndexOf("/") + 1) + "> in the simulator map");
				System.err.println(sout.toString());

			} else if (e instanceof ParseException) {
				sout = new StartOutput(-5, "The model name " + modelPath.substring(modelPath.lastIndexOf("/") + 1)
						+ " Does not match:" + " Check for case sensitive in <<modelname.asm>>");
				System.err.println(sout.toString());
			}

			else {
				sout = new StartOutput(-6, "General Exception: Please report the problem");
				System.err.println(sout.toString());
			}

		}
		return sout.getId();
	}
	
	//tries to start a simulation that begins already on the given state, behaves same as startexecution.
	private int restartExecution(String modelPath,int oldId, State state) {
		StartOutput sout = null;
		try {
			id = asmS.restart(modelPath,oldId, state);
			ids = checkStartId(id);
			sout = new StartOutput(ids, "The id " + ids + " is successfully created");
			simulationRunning = SimStatus.PAUSE;
			System.out.println(sout.toString());
		} catch (Exception e) {
			if (e instanceof MainRuleNotFoundException) {
				sout = new StartOutput(-2, "Main Rule Not Found");
				System.err.println(sout.toString());
			} 
			else if (e instanceof AsmModelNotFoundException) {
				sout = new StartOutput(-3,
						"The Model " + modelPath.substring(modelPath.lastIndexOf("/") + 1) + " Doesn't esist");
				System.err.println(sout.toString());
			} 
			else if (e instanceof FullMapException) {
				sout = new StartOutput(-4, "The simulator map is Full " + "can't add the model <"
						+ modelPath.substring(modelPath.lastIndexOf("/") + 1) + "> in the simulator map");
				System.err.println(sout.toString());
			} 
			else if (e instanceof ParseException) {
				sout = new StartOutput(-5, "The model name " + modelPath.substring(modelPath.lastIndexOf("/") + 1)
						+ " Does not match:" + " Check for case sensitive in <<modelname.asm>>");
				System.err.println(sout.toString());
			} 
			else if (e instanceof InvalidInvariantException) {
				sout = new StartOutput(-7, "Invalid invariant on initial state, please check the updated model again");
				System.err.println(sout.toString());
			}
			else {
				sout = new StartOutput(-6, "General Exception: Please report the problem");
				System.err.println(sout.toString());
			}
		}
		return sout.getId();
	}
	/*
	 * (non-Javadoc)
	 * 
	 * @see asmeta.safetyawaremodeleexecute.client.IModelExecute#stopExecution(int)
	 * stop of giusso remove a simulator(model) by an id
	 */
	// @Override
	public int stopExecution(int id) {
		try {
			System.out.println("the model " + asmS.getModelName(id) + " is successfully stop");
			asmS.stop(id);
			id = 1;
		} catch (RuntimeException e) {
			if (e instanceof IdNotFoundException) {
				System.out.println("the " + id + " is not found");
				id = -1;
			}
		}
		return id;
	}
	
	@Override
	public int init(int maxSimInstance) {
		while (maxSimInstance <= 0) {
			System.out.print("Insert a positive number for the simulator table: ");
			Scanner scan = new Scanner(System.in);
			maxSimInstance = scan.nextInt();
			scan.close();
		}
		System.out.printf("max number of simulators %d" + " successfully instantiated:\n", maxSimInstance);
		asmS.init(maxSimInstance);
		return maxSimInstance;

	}

	@Override
	public RunOutput runStep(int id, Map<String, String> locationValue) {
		simulationRunning=SimStatus.RUNNING;
		rollbStatus = rollbackStatus.NOTROLLED;
		RunOutput rout = new RunOutput(Esit.UNSAFE, "rout not intialized");
		String modelPath=null;
		try {
			try {
				modelPath=asmS.getSimulatorTable().get(id).getModelPath();
			} catch (NullPointerException e) {
				throw new IdNotFoundException("Id not valid");
			}
			if (locationValue!=null) 
				rout = checkSafety(modelPath, locationValue);
			if (rout.equalsMessage(new RunOutput(Esit.UNSAFE, "rout not intialized"))) {
				startRun = System.nanoTime();
				ms = asmS.run(id, locationValue);
				endRun = System.nanoTime();
				duration = (endRun - startRun);
				if (locationValue!=null) 
					rout = new RunOutput(Esit.SAFE, asmS.getCurrentState(id).getMonitoredValues(), ms);
				else
					rout = new RunOutput(Esit.SAFE, ms);
				printState(asmS.getSimulatorTable().get(id).getSim().getCurrentStep(), rout, duration, id);
			}
		} catch (Exception e) {
			if (e instanceof InvalidInvariantException) {
				System.err.println("No transition to step " + (asmS.getSimulatorTable().get(id).getContSim() + 1)
						+ "  for model "
						+ asmS.getSimulatorTable().get(id).getModelPath().substring(modelPath.lastIndexOf("/") + 1));
				rout = new RunOutput(Esit.UNSAFE, "Invalid Invariant");
				System.err.println(rout.toString());
				try {
					rollbStatus = rollbackStatus.ROLLINGBACK;
					printRollback(asmS.getSimulatorTable().get(id).getContSim(), asmS.rollback(id));
				} catch (NullPointerException e1) {
					System.out.println("no previous state");
				}finally {
					rollbStatus = rollbackStatus.ROLLOK;
				}

			} else if (e instanceof IdNotFoundException) {
				rout = new RunOutput(Esit.UNSAFE, "the id is not found");
				System.err.println(rout.toString());

			} else if (e instanceof UpdateClashException) {
				if (modelPath != null)
					System.err.println("No transition to step " + (asmS.getSimulatorTable().get(id).getContSim() + 1)
							+ "  for model "
							+ asmS.getSimulatorTable().get(id).getModelPath().substring(modelPath.lastIndexOf("/") + 1));
				else
					System.err.println("No transition to step " + (asmS.getSimulatorTable().get(id).getContSim() + 1)
							+ "  for model " + asmS.getSimulatorTable().get(id).getModelPath()
									.substring(asmS.getSimulatorTable().get(id).getModelPath().lastIndexOf("/") + 1));
				rout = new RunOutput(Esit.UNSAFE, "Inconsistent Update");
				System.err.println(rout.toString());
				try {
					rollbStatus = rollbackStatus.ROLLINGBACK;
					printRollback(asmS.getSimulatorTable().get(id).getContSim(), asmS.rollback(id));
				} catch (NullPointerException e1) {
					System.out.println("no previous state");
				}finally {
					rollbStatus = rollbackStatus.ROLLOK;
				}

			} else if (e.getCause() instanceof InputMismatchException) {
				System.err.println("No transition to step " + (asmS.getSimulatorTable().get(id).getContSim() + 1)
						+ " for model "
						+ asmS.getSimulatorTable().get(id).getModelPath().substring(modelPath.lastIndexOf("/") + 1));
				rout = new RunOutput(Esit.UNSAFE, "Invalid Input value");
				System.err.println(rout.toString());
				try {
					rollbStatus = rollbackStatus.ROLLINGBACK;
					printRollback(asmS.getSimulatorTable().get(id).getContSim(), asmS.rollback(id));
				} catch (NullPointerException e1) {
					System.out.println("no previous state");
				}finally {
					rollbStatus = rollbackStatus.ROLLOK;
				}
			}
		}
		simulationRunning = SimStatus.PAUSE;
		return rout; // can be use for Json

	}
	
	@Override
	public RunOutput runStep(int id) {
		return runStep(id, null);
	}
	
	/*@Override
	public RunOutput runStep(int id) {
			
		RunOutput rout = null;
		ss=SimStatus.RUNNING;
		try {
			startRun = System.nanoTime();
			ms = asmS.run(id);
			endRun = System.nanoTime();
			duration = (endRun - startRun);
			rout = new RunOutput(Esit.SAFE, ms);
			printState(stepRun++, rout, duration, id);

		} catch (RuntimeException e) {
			if (e instanceof IdNotFoundException) {
				rout = new RunOutput(Esit.UNSAFE, "the id is not found");
				System.err.println(rout.toString());

			} else if (e instanceof UpdateClashException) {
				System.err.println("No transition to step " + (asmS.getSimulatorTable().get(id).getContSim() + 1)
						+ "  for model " + asmS.getSimulatorTable().get(id).getModelPath()
								.substring(asmS.getSimulatorTable().get(id).getModelPath().lastIndexOf("/") + 1));
				rout = new RunOutput(Esit.UNSAFE, "Inconsistent Update");
				System.err.println(rout.toString());
				printRollback(asmS.getSimulatorTable().get(id).getContSim(), asmS.rollback(id));

			}
		}
		ss=SimStatus.PAUSE;
		return rout; // can be use for Json

	}*/
	
	public RunOutput runStepTimeout(int id,int timeout) {
		return runStepTimeout(id,null,timeout);
	}
	
	public RunOutput runStepTimeout(int id,Map<String, String> locationValue,int timeout) {	
		Timer timer = new Timer(false);
		
		RunOutput rout = new RunOutput(Esit.UNSAFE, "rout not intialized");
	    routTO = rout;
	    
	    MyState pre = asmS.getCurrentState(id);
	    
        TimerTask timeoutTask = new TimerTask() {
        	@Override  
            public void run() {  
            	 //System.out.println("Timer task started at:"+new Date());
        		try {
               		routTO = runStep(id, locationValue);
        		}catch (Exception e) {}
        		finally {
               		routTO.setResult(true);
        			timer.cancel();
        		}

                 //System.out.println("Timer task finished at:"+new Date());
            }; 
        };  
	    //running timer task as daemon thread (no start delay, no period) but with timeout (thanks to Thread.sleep(timeout))
	    timer.schedule(timeoutTask, 0);
	    //System.out.println("TimerTask started");
	    //cancel after timeout if the task has not terminated
	    if (timeout<0)
	    	timeout=1;
	    try {
	        Thread.sleep(timeout);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	    /*if (! taskTerminated.getResult()) { 
	    	timer.cancel();
	    	System.out.println("TimerTask cancelled"+" -- flag TaskTerminated: "+taskTerminated.getResult());
	    }
	    else System.out.println("TimerTask alive"+" -- flag TaskTerminated: "+taskTerminated.getResult());*/
	    
	    if (!routTO.getResult()) {	//if the thread is still going after time runs out  
    		while (rollbStatus==rollbackStatus.ROLLINGBACK) {	//cannot stop the timertask while it's doing a rollback
    			try {
    				Thread.sleep(10);	//how often the program check for the rollback to finish before killing the thread
        		} catch (InterruptedException e) {
                    e.printStackTrace();}
    		}
    		while (!routTO.getResult()) {
    			try {
    				Thread.sleep(10);	
        		} catch (InterruptedException e) {
                    e.printStackTrace();}
    		}
    		timer.cancel();
	    	rout = new RunOutput(Esit.UNSAFE, "Run timed out");	//returns that the operation couldn't be finished in time
	    	System.err.println(rout.toString());

	    	MyState after = asmS.getCurrentState(id);
	    	
			if (rollbStatus!=rollbackStatus.ROLLOK && after!=null && !after.equals(pre))	//do a rollback if it has not already been done 
			{
				try {
					printRollback(asmS.getSimulatorTable().get(id).getContSim(), asmS.rollback(id));
				} catch (NullPointerException e1) {
					System.out.println("no previous state");
				}/* catch (EmptyStackException e1) {
					System.out.println("empty stack exception dal simulator");
				}*/
			}
	    	
	    	/*timer.cancel();
	    	routTO = new RunOutput(Esit.UNSAFE, "Run timed out");
			System.err.println(routTO.toString());
			/*try {
				printRollback(asmS.getSimulatorTable().get(id).getContSim(), asmS.rollback(id));
			} catch (NullPointerException e1) {
				System.out.println("no previous state");
			}*/
	    }else
	    	rout=routTO;
	    //else System.out.println("TimerTask alive"+" -- flag TaskTerminated: "+routTO.getResult());	
	        
	 	return rout;
	}
	


	
	@Override
	public RunOutput runUntilEmpty(int id, Map<String, String> locationValue, int max) {
		simulationRunning = SimStatus.RUNNING;
		rollbStatus = rollbackStatus.NOTROLLED;
		RunOutput rout = new RunOutput(Esit.UNSAFE, "rout not intialized");		
		String modelPath=null;
		try {
			try {
				modelPath=asmS.getSimulatorTable().get(id).getModelPath();
			} catch (NullPointerException e) {
				throw new IdNotFoundException("Id not valid");
			}
			if (locationValue!=null)
				rout = checkSafety(modelPath, locationValue);
			
			if (rout.equalsMessage(new RunOutput(Esit.UNSAFE, "rout not intialized"))) {
				startRun = System.nanoTime();
				ms = asmS.runUntilEmpty(id, locationValue, max);
				endRun = System.nanoTime();
				duration = (endRun - startRun);
				rout = new RunOutput(Esit.SAFE, asmS.getCurrentState(id).getMonitoredValues(), ms);
				printState(asmS.getSimulatorTable().get(id).getContSim(), rout, duration, id);
			}
		} catch (RuntimeException e) {
			if (e instanceof InvalidInvariantException) {
				System.err.println("No transition to step " + (asmS.getSimulatorTable().get(id).getContSim() + 1)
						+ "  for model " + asmS.getSimulatorTable().get(id).getModelPath()
								.substring(asmS.getSimulatorTable().get(id).getModelPath().lastIndexOf("/") + 1));
				rout = new RunOutput(Esit.UNSAFE, "Invalid Invariant");
				System.err.println(rout.toString());
				try {
					rollbStatus = rollbackStatus.ROLLINGBACK;
					printRollback(asmS.getSimulatorTable().get(id).getContSim(), asmS.rollback(id));					
				} catch (NullPointerException e1) {
					System.out.println("no previous state");
				}finally {
					rollbStatus = rollbackStatus.ROLLOK;
				}

			} else if (e instanceof IdNotFoundException) {
				//System.err.println("No transition to step " + (asmS.getSimulatorTable().get(id).getContSim() + 1)
					//	+ "  for model " + asmS.getSimulatorTable().get(id).getModelPath()
							//	.substring(asmS.getSimulatorTable().get(id).getModelPath().lastIndexOf("/") + 1));
				rout = new RunOutput(Esit.UNSAFE, "the id is not found");
				System.err.println(rout.toString());

			} else if (e instanceof UpdateClashException) {
				System.err.println("No transition to step " + (asmS.getSimulatorTable().get(id).getContSim() + 1)
						+ "  for model " + asmS.getSimulatorTable().get(id).getModelPath()
								.substring(asmS.getSimulatorTable().get(id).getModelPath().lastIndexOf("/") + 1));
				rout = new RunOutput(Esit.UNSAFE, "Inconsistent Update");
				System.err.println(rout.toString());
				try {
					rollbStatus = rollbackStatus.ROLLINGBACK;
					printRollback(asmS.getSimulatorTable().get(id).getContSim(), asmS.rollback(id));
				} catch (NullPointerException e1) {
					System.out.println("no previous state");
				}finally {
					rollbStatus = rollbackStatus.ROLLOK;
				}
			} else if (e.getCause() instanceof InputMismatchException) {
				System.err.println("No transition to step " + (asmS.getSimulatorTable().get(id).getContSim() + 1)
						+ "  for model " + asmS.getSimulatorTable().get(id).getModelPath()
								.substring(asmS.getSimulatorTable().get(id).getModelPath().lastIndexOf("/") + 1));
				rout = new RunOutput(Esit.UNSAFE, "Invalid input value");
				System.err.println(rout.toString());
				try {
					rollbStatus = rollbackStatus.ROLLINGBACK;
					printRollback(asmS.getSimulatorTable().get(id).getContSim(), asmS.rollback(id));
				} catch (NullPointerException e1) {
					System.out.println("no previous state");
				}finally {
					rollbStatus = rollbackStatus.ROLLOK;
				}

			}
		}
		simulationRunning=SimStatus.PAUSE;
		return rout;

	}
	
	@Override
	public RunOutput runUntilEmpty(int id) {
		return runUntilEmpty(id, null, 0);
	}

	@Override
	public RunOutput runUntilEmpty(int id, Map<String, String> locationValue) {
		return runUntilEmpty(id, locationValue, 0);
	}

	@Override
	public RunOutput runUntilEmpty(int id, int max) {
		return runUntilEmpty(id, null, max);
	}
	
	public RunOutput runUntilEmptyTimeout(int id, int max, int timeout) {
	 	 
	 	return runUntilEmptyTimeout(id, null, max, timeout);
	}
	
	//same logic as the one with runstep but using runUntilEmpty and rollbacktostate instead
	public RunOutput runUntilEmptyTimeout(int id, Map<String, String> locationValue, int max, int timeout) {
		routTO = new RunOutput(Esit.UNSAFE, "rout not intialized");
        TimerTask timeoutTask = new TimerTask() {
        	@Override  
            public void run() {  
            	 //System.out.println("Timer task started at:"+new Date());
            	 routTO = runUntilEmpty(id, locationValue, max);
            	 routTO.setResult(true);
                 //System.out.println("Timer task finished at:"+new Date());
            }; 
        };  
        
        Timer timer = new Timer(true);
        //running timer task as daemon thread (no start delay, no period) but with timeout (thanks to Thread.sleep(timeout))
        timer.schedule(timeoutTask, 1);
        //System.out.println("TimerTask started");
        //cancel after timeout if the task has not terminated
	    if (timeout<0)
	    	timeout=1;
        try {
            Thread.sleep(timeout);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        /*if (! taskTerminated.getResult()) { 
        	timer.cancel();
        	System.out.println("TimerTask cancelled"+" -- flag TaskTerminated: "+taskTerminated.getResult());
        }
        else System.out.println("TimerTask alive"+" -- flag TaskTerminated: "+taskTerminated.getResult());*/
        if (!routTO.getResult()) { 
        	
        	{
        		while (rollbStatus==rollbackStatus.ROLLINGBACK) {
        			try {
        				Thread.sleep(10);	//how often the program check for the rollback to finish before killing the thread
	        		} catch (InterruptedException e) {
	                    e.printStackTrace();}
        		}
        		timer.cancel();
        		routTO = new RunOutput(Esit.UNSAFE, "Run timed out");
    			System.err.println(routTO.toString());
    			if (rollbStatus!=rollbackStatus.ROLLOK)
    			{
    				try {
    					printRollback(asmS.getSimulatorTable().get(id).getContSim(), asmS.rollbackToState(id));
    				} catch (NullPointerException e1) {
    					System.out.println("no previous state");
    				}/* catch (EmptyStackException e1) {
    					System.out.println("empty stack exception dal simulator");
    				}*/
    			}
    				
        	}
        	
        	/*timer.cancel();
        	routTO = new RunOutput(Esit.UNSAFE, "Run timed out");
			System.err.println(routTO.toString());
			try {
				printRollback(asmS.getSimulatorTable().get(id).getContSim(), asmS.rollback(id));
			} catch (NullPointerException e1) {
				System.out.println("no previous state");
			}/* catch (EmptyStackException e1) {
				System.out.println("empty stack exception dal simulator");
			}*/
        }
        
        //else System.out.println("TimerTask alive"+" -- flag TaskTerminated: "+routTO.getResult());	  
	 	return routTO;
	}
	

	public RunOutput runUntilEmptyTimeout(int id, int timeout) {
		return runUntilEmptyTimeout(id, null, 0, timeout);
	}


	public RunOutput runUntilEmptyTimeout(int id, Map<String, String> locationValue, int timeout) {
		return runUntilEmptyTimeout(id, locationValue, 0, timeout);
	}

	private static void printState(int step, RunOutput r1, long time, int id) {
		System.out.println(
				"[step:" + asmS.getSimulatorTable().get(id).getContSim() + " of model " + asmS.getModelName(id) + "]");
		System.out.println(r1.MytoString());
		System.out.println("time execution :" + time + " nT");
		System.out.println(
				"number of steps for the transition: " + asmS.getSimulatorTable().get(id).getSim().getCurrentStep());
		/*
		 * System.out.println("Maximum number of state before rollBackToState: " +
		 * asmS.getSimulatorTable().get(id).getSim().getMax() );
		 */

		System.out.println("                                 ");

		System.out.println("=====================");
	}

	private static void printRollback(int step, MyState state) {

		System.out.println("<Exception make return at previous step " + step + ">");

		if (state.controlledValues.size() != 0)
			System.out.println("< Controlled function >");

		for (Entry<Location, Value> entry : state.getControlledValues().entrySet()) {
			System.out.println("- " + entry.getKey().toString() + ": " + entry.getValue().toString());
		}
		System.out.println("=====================");

	}


	/**
	 * Check safety: Verifica se il nome del input � corretto
	 *
	 * @param modelPath     the model path
	 * @param locationValue Change to CheckInputName Safety
	 * @return the array list
	 */
	private RunOutput checkSafety(String modelPath, Map<String, String> locationValue) {
		ArrayList<String> nomi = new ArrayList<String>(); // per salvare i nomi di quelli che sono monitorate
		RunOutput rout = new RunOutput(Esit.UNSAFE, "rout not intialized");
		// AsmCollection asm = null;
		String name = "";
		try {
			File asmFile = new File(modelPath);
			if (!asmFile.exists()) {
				throw new AsmModelNotFoundException(modelPath);
			}

			AsmCollection asm = ASMParser.setUpReadAsm(asmFile);
			// cerco di prendere la classe delle monitorate
			for (int i = 0; i < asm.getMain().getHeaderSection().getSignature().getFunction().size(); i++) {
				if (asm.getMain().getHeaderSection().getSignature().getFunction()
						.get(i) instanceof MonitoredFunctionImpl)
					nomi.add(asm.getMain().getHeaderSection().getSignature().getFunction().get(i).getName());

			}

	
			boolean found = false;
			for (String s : locationValue.keySet()) {
				for (int i = 0; i < nomi.size(); i++) {
					if (s.equals(nomi.get(i))) {
						found = true;
					}
				}
				if (!found) {
					name = s;
					throw new NameMistMatchException("Name <<" + s + ">> Not Found");
				} else
					found = true;

			}
		} catch (Exception e) {
			if (e instanceof NameMistMatchException) {
				//System.err.println("No transition to step " 
						//+ "  for model " + asmS.getSimulatorTable().get(id).getModelPath()
							//	.substring(asmS.getSimulatorTable().get(id).getModelPath().lastIndexOf("/") + 1));
				rout = new RunOutput(Esit.UNSAFE, "monitored name <<" + name + ">> not found");
				System.err.println(rout.toString());
			}

		}

		return rout;
	}

	/**
	 * Check start id.
	 *
	 * @return the int
	 * @throws FullMapException the full map exception
	 */
	private int checkStartId(int idC) throws FullMapException { 
		if (idC == -1) {
			idC = -5;
			throw new FullMapException("The map is full");
		}

		return idC;

	}
	
	
	public RunOutput runStepTransaction(int id,Queue<Map<String, String>> locationValue, String modelPath) { //TODO da finalizzare?
		boolean unsafe = false;
		RunOutput routTR = new RunOutput(Esit.UNSAFE, "rout not intialized");
		RunOutput rout = new RunOutput(Esit.UNSAFE, "rout not intialized");
		Map<String,String> element = new HashMap<String, String>();
		int statecount=0;
		while (!locationValue.isEmpty() && unsafe == false) {
			element=locationValue.poll();
			rout = runStep(id,element);
			statecount++;
			if(routTR.equals(rout)) {
				unsafe = true;
			}
		}
		
		if(unsafe==true)
		{
			for(int i=1;i<statecount;i++)
				printRollback(asmS.getSimulatorTable().get(id).getContSim(), asmS.rollback(id));
		}
		
		return rout;	
		
	}
	public RunOutput runTransaction(int id,Queue<Map<String, String>> locationValue) { //TODO da finalizzare?
		boolean unsafe = false;
		RunOutput routTR = new RunOutput(Esit.UNSAFE, "rout not intialized");
		RunOutput rout = new RunOutput(Esit.UNSAFE, "rout not intialized");
		Map<String,String> element = new HashMap<String, String>();
		int statecount=0;
		while (!locationValue.isEmpty() && unsafe == false) {
			element=locationValue.poll();
			rout = runUntilEmpty(id,element);
			statecount++;
			if(routTR.equals(rout)) {
				unsafe = true;
			}
		}
		
		if(unsafe==true)
		{
			for(int i=1;i<statecount;i++)
				printRollback(asmS.getSimulatorTable().get(id).getContSim(), asmS.rollbackToState(id));
		}
		
		return rout;	
		
	}
	
	@Override
	public int addInvariant(int id, String invariant_to_add) {
		if (!asmS.checkValidId(id))
			return -1;
		boolean success = true;
		int start_output = 0;     // if > 0 everything goes well   if<0 exception error
		String modelfile=asmS.getSimulatorTable().get(id).getModelPath();
		State state = asmS.getSimulatorTable().get(id).getSim().getCurrentState(); 
		String variable = "";
		String appoggio;
		BufferedReader reader;
		try {
			reader = Files.newBufferedReader(Paths.get(modelfile));
			BufferedWriter writer = Files.newBufferedWriter(Paths.get(modelfile+"_to_overwrite"));
			String line = reader.readLine();
			
			Files.copy(Paths.get(modelfile), Paths.get(modelfile+"_old"), StandardCopyOption.REPLACE_EXISTING);
			if(invariant_to_add.contains("inv_"))
			{
				variable=invariant_to_add.substring(invariant_to_add.indexOf("inv_")+4,invariant_to_add.indexOf("over"));
			}
			
			while (line != null)
			{
				appoggio=line.trim();
				if(appoggio.contains("inv_"))
				{
					if(appoggio.substring(appoggio.indexOf("inv_")+4,appoggio.indexOf("over")).equals(variable))
					{
						System.out.println("UGUALI");
						success=false;
					}
				}
				if (success)
				{
					if (line.trim().startsWith("main rule")){
						writer.write("\t"+invariant_to_add+"\n");
					}
				}
				writer.write(line+"\n");
				line = reader.readLine();
			}
			reader.close();	
			writer.close();
			
			/*File file = new File(modelfile);
			file.delete();
			File file2 = new File(modelfile+"_to_overwrite");
			success = file2.renameTo(file);*/
			overwrite(modelfile,"_to_overwrite");
			
		    /*File f = new File(modelfile);		//CONTROLLO SE FILE APERTO
		    File sameFileName = new File(modelfile);
		    if(f.renameTo(sameFileName)){
		        System.out.println("file is closed");    
		    }else{
		        System.out.println("file is opened");
		    }*/
		    
			if (success)
				start_output=restartSim(id, state);
			else
				start_output=-8;
			if (start_output<0) {
				
			    /*f = new File(modelfile);		//CONTROLLO SE FILE APERTO
			    sameFileName = new File(modelfile);
			    if(f.renameTo(sameFileName)){
			        System.out.println("file is closed");    
			    }else{
			        System.out.println("file is opened");
			    }*/
			    
				overwrite(modelfile,"_old");
			    //Files.copy(Paths.get(modelfile+"_old"), Paths.get(modelfile), StandardCopyOption.REPLACE_EXISTING);
				if (success)
					restartExecution(modelfile,id, state); 
			}

		} catch (IOException e) {
			System.out.println("Couldn't open or write the model file");
			success=false;
		} finally {
			try {
				Files.deleteIfExists(Paths.get(modelfile+"_old"));
				Files.deleteIfExists(Paths.get(modelfile+"_to_overwrite"));
			} catch (IOException e) {}
		}
			
	    return start_output;
	}



	@Override
	public InvariantData viewListInvariant(int id) {
		String invar;
		//List<String> invarList = new ArrayList<String>();
		InvariantData inv_manager = new InvariantData();
		if (!asmS.checkValidId(id))
			return null;
		String values="";
		//variables = new ArrayList<String>();
		invarNames = new ArrayList<String>();
		boolean endinvariant = true;
		BufferedReader reader;
		try {
			reader = Files.newBufferedReader(Paths.get(asmS.getSimulatorTable().get(id).getModelPath()));
			String line = reader.readLine().trim();
			if (line==null)
				endinvariant=false;
			while (endinvariant) {
				if (line.contains("signature")){
					while(!line.contains("definitions"))
					{
						if(line.contains("controlled") || line.contains("monitored") || line.contains("derived"))
						{
							if(line.contains("controlled"))
							{
							   values=line.substring(line.indexOf("controlled")+11,line.indexOf(":")).trim();
							   inv_manager.variables.add(values);
							}
							else if(line.contains("monitored"))
							{
								values=line.substring(line.indexOf("monitored")+10,line.indexOf(":")).trim();
								inv_manager.variables.add(values);
							}else if(line.contains("derived"))
							{
								values=line.substring(line.indexOf("derived")+8,line.indexOf(":")).trim();
								inv_manager.variables.add(values);
							}
							
						}
						line = reader.readLine().trim();
					}
				}
				if (line.startsWith("invariant")){
					invar="";
					do {
						if (line.contains("//"))
							invar = invar+line.substring(0, line.indexOf("//"));
						else
							invar = invar+line;
						line=reader.readLine().trim();
						if (line==null || line.startsWith("main rule"))
							endinvariant=false;
					}while(endinvariant && !line.startsWith("invariant"));
					if(invar.contains("inv_"))
						invarNames.add(invar.substring(invar.indexOf("inv_")+4,invar.indexOf("over")-1));
					//System.out.println(invar);
					inv_manager.invarList.add(invar);
				}else {
					if(line.startsWith("main rule"))
						endinvariant=false;
					line = reader.readLine().trim();
				}
			}
			reader.close();	
		} catch (IOException e) {
			System.out.println("Couldn't open and read the given model");
		} 
		return inv_manager;
	}


	@Override
	public int updateInvariant(int id, String new_invariant, String old_invariant) {
		if (!asmS.checkValidId(id))
			return -1;
		old_invariant=old_invariant.substring(0, old_invariant.indexOf(':')+1)+old_invariant.substring(old_invariant.indexOf(':')+1).trim();
		boolean endinvariant=true;
		int start_output = 0;
		String modelfile=asmS.getSimulatorTable().get(id).getModelPath();
		State state = asmS.getSimulatorTable().get(id).getSim().getCurrentState(); 
		BufferedReader reader;
		BufferedReader reader2;
		boolean exit=true;
		try {
			reader2 = Files.newBufferedReader(Paths.get(modelfile));
			Files.copy(Paths.get(modelfile), Paths.get(modelfile+"_old"), StandardCopyOption.REPLACE_EXISTING);
			String line = reader2.readLine();
			String reading_invariant;
			String inv="";
			String new_invariant_name = "";
			String old_invariant_name = "";
			if(new_invariant.contains("inv_"))
			{							
				new_invariant_name = new_invariant.substring(new_invariant.indexOf("inv_")+4,new_invariant.indexOf("over")).trim();
				if(old_invariant.contains("inv_"))
					old_invariant_name = old_invariant.substring(old_invariant.indexOf("inv_")+4,old_invariant.indexOf("over")).trim();
				while(line!=null && exit)
				{
					if (line.trim().contains("inv_")){					
					   inv=line.substring(line.indexOf("inv_")+4,line.indexOf("over")).trim();
					   System.out.println("INV "+inv);
						if(new_invariant_name.equals(inv) && !inv.equals(old_invariant_name))
						{
							start_output=-8;
							exit=false;	
						}
					}
					 line=reader2.readLine();
				}
				reader2.close();
			}
			 
		    if(start_output!=-8)
			{
				reader = Files.newBufferedReader(Paths.get(modelfile));		
			    line = reader.readLine();
				BufferedWriter writer = Files.newBufferedWriter(Paths.get(modelfile+"_to_overwrite"));
				Files.copy(Paths.get(modelfile), Paths.get(modelfile+"_old"), StandardCopyOption.REPLACE_EXISTING);
				while (line!=null)
				{
					if (line.trim().startsWith("invariant")){
						reading_invariant="";
						do {
							if (line.contains("//"))
								reading_invariant = reading_invariant+line.substring(0, line.indexOf("//"));
							else
								reading_invariant = reading_invariant+line;
							if(line.startsWith("//"))
								writer.write("\t"+line+"\n");
							line=reader.readLine().trim();
							if (line==null || line.startsWith("main rule"))
								endinvariant=false;
						}while(endinvariant && !line.startsWith("invariant"));
						if(reading_invariant.contains(": "))
							reading_invariant = reading_invariant.replace(": ", ":");
						if(reading_invariant.trim().equals(old_invariant))
							writer.write("\t"+new_invariant+"\n");
						else
							writer.write("\t"+reading_invariant.trim()+"\n");
					}
					else {
						if(line.startsWith("main rule"))
							writer.write("\n\t"+line+"\n");
						else
							writer.write(line+"\n");
						line = reader.readLine();
					}
				}
			reader.close();
			writer.close();
		
			/*File file = new File(modelfile);
			file.delete();
			File file2 = new File(modelfile+"_to_overwrite");
			success = file2.renameTo(file);	*/
			overwrite(modelfile,"_to_overwrite");
			start_output=restartSim(id, state);
			}
		    if (start_output<0) {
				overwrite(modelfile,"_old");
				//Files.copy(Paths.get(modelfile+"_old"), Paths.get(modelfile), StandardCopyOption.REPLACE_EXISTING);
				restartExecution(modelfile,id,state);
			}
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Couldn't open and read the given model");
		} finally {
			try {
				Files.deleteIfExists(Paths.get(modelfile+"_old"));
				Files.deleteIfExists(Paths.get(modelfile+"_to_overwrite"));
			} catch (IOException e) {}
		}

	return start_output;
	}
	

	@Override
	public boolean removeInvariant(int id, String remove_invariant) {
			if (!asmS.checkValidId(id))
				return false;
			remove_invariant=remove_invariant.substring(0, remove_invariant.indexOf(':')+1)+remove_invariant.substring(remove_invariant.indexOf(':')+1).trim();
			boolean success = false;
			boolean endinvariant=true;
			String modelfile=asmS.getSimulatorTable().get(id).getModelPath();
			State state = asmS.getSimulatorTable().get(id).getSim().getCurrentState(); 
			BufferedReader reader;
			try {
				reader = Files.newBufferedReader(Paths.get(modelfile));
				BufferedWriter writer = Files.newBufferedWriter(Paths.get(modelfile+"_to_overwrite"));
				
				Files.copy(Paths.get(modelfile), Paths.get(modelfile+"_old"), StandardCopyOption.REPLACE_EXISTING);
				
				String line = reader.readLine();
				String reading_invariant;
				while (line!=null)
				{
					if (line.trim().startsWith("invariant")){
						reading_invariant="";
						do {
							if (line.contains("//"))
								reading_invariant = reading_invariant+line.substring(0, line.indexOf("//"));
							else
								reading_invariant = reading_invariant+line;
							if(line.startsWith("//"))
								writer.write("\t"+line+"\n");
							line=reader.readLine().trim();
							if (line==null || line.startsWith("main rule"))
								endinvariant=false;
							if(reading_invariant.contains(": "))
								reading_invariant = reading_invariant.replace(": ", ":");
						}while(endinvariant && !line.startsWith("invariant"));
						if(!reading_invariant.trim().equals(remove_invariant))
							writer.write("\t"+reading_invariant.trim()+"\n");
					}
					else {
						if(line.startsWith("main rule"))
							writer.write("\n\t"+line+"\n");
						else
							writer.write(line+"\n");
						line = reader.readLine();
					}
				}
				reader.close();
				writer.close();
				
				/*File file = new File(modelfile);
				file.delete();
				File file2 = new File(modelfile+"_to_overwrite");
				success = file2.renameTo(file);*/
				overwrite(modelfile,"_to_overwrite");
				if (restartSim(id, state)<0) { // TODO sistemare controllo restartsim come in add
					//Files.copy(Paths.get(modelfile+"_old"), Paths.get(modelfile), StandardCopyOption.REPLACE_EXISTING);
					overwrite(modelfile,"_old");
					restartExecution(modelfile,id,state);
				}else {
					success=true;
				}
			}
			catch (IOException e) {
				System.out.println("Couldn't open, read or write the model file");
			} finally {
				try {
					Files.deleteIfExists(Paths.get(modelfile+"_old"));
					Files.deleteIfExists(Paths.get(modelfile+"_to_overwrite"));
				} catch (IOException e) {}
			}
			
		return success;
	}
	//stops and starts again the simulation
	private int restartSim(int id, State state) {
		//boolean success = true;
		while (simulationRunning == SimStatus.RUNNING) { //cannot stop the simulation until it has finished the current operation
			try {
				Thread.sleep(100);	//how often the program check for the simulation to finish its execution
    		} catch (InterruptedException e) {
                e.printStackTrace();}
		}
		String modelPath = asmS.getSimulatorTable().get(id).getModelPath();
		if (state==null)
			state = asmS.getSimulatorTable().get(id).getSim().getCurrentState();
		if (state.previousLocationValues==null)
			state.previousLocationValues = new HashMap<Location, Value>();
		stopExecution(id);		
		int res = restartExecution(modelPath,id, state);
		return res;
	}
	
	//used to replace the currently loaded model file with another version regulated by the mod string
	private void overwrite(String model, String mod) {
		File fnew=new File(model);
		FileWriter f2;
		try {
		    f2 = new FileWriter(fnew,false);
		    f2.write(String.join("\n",Files.readAllLines(Paths.get(model+mod))));
		    f2.close();
		 } catch (IOException e) {
		       System.out.println("Couldn't overwrite the model file");
		 } 
	}
	
	/*public List<String> getVariables() {
	    return variables;
	}*/
	
	public Map<Integer, String> getLoadedIDs() {
		int max = asmS.getMaxInstances();
		Map<Integer, String> ids=new HashMap<Integer,String>();
		for (int i=1;i<=max;i++) 
			if (asmS.checkValidId(i))
				ids.put(i, asmS.getSimulatorTable().get(i).getModelPath());
		return ids;
	}
	
	/*private void overwrite(String model) {
		File fnew=new File(model);
		String source = "";
		FileWriter f2;
		try {
			//Files.readAllLines(Paths.get(model+"_old"));
		    f2 = new FileWriter(fnew,false);
		    f2.write(String.join("\n",Files.readAllLines(Paths.get(model+"_old"))));
		    f2.close();
		 } catch (IOException e) {
		       e.printStackTrace();
		 } 
	}*/
	
	/*private void overwrite2(String model) {
		File fnew=new File(model);
		String source = "";
		FileWriter f2;
		try {
			//Files.readAllLines(Paths.get(model+"_to_overwrite"));
		    f2 = new FileWriter(fnew,false);
		    f2.write(String.join("\n",Files.readAllLines(Paths.get(model+"_to_overwrite"))));
		    f2.close();
		 } catch (IOException e) {
		       e.printStackTrace();
		 } finally {
			 try {
					Files.deleteIfExists(Paths.get(model+"_to_overwrite"));
				} catch (IOException e) {}
		 }
	}*/
	
	/*public List<String> getVariables() {
	    return variables;
	  }*/
	/*@Override	 //INVARIANTS CON ASMCOLLECTION DINAMICO
	public List<Invariant> viewListInvariant(int id) {
		
		//System.out.println(asmS.getSimulatorTable().get(id).getSim().);
		//System.out.println(asmS.getSimulatorTable().get(id).getSim().getAsmCollection().getMain().getBodySection().getInvariantConstraint());
		System.out.println( asmS.getSimulatorTable().get(id).getModelPath());
		for (Iterator<Asm> i = asmS.getSimulatorTable().get(id).getSim().getAsmCollection().iterator(); i.hasNext();) {
			Asm asm_i = i.next();
			Body b = asm_i.getBodySection();
			Collection<Property> propertiesList = b.getProperty();
			if (propertiesList != null) {
				for (Property property: propertiesList) {
					if(property instanceof Invariant) {
						//Term body = ((Invariant)property).getBody();
						System.out.println(((Invariant)property).toString());
					}
				}
			}
		}
		return null;
	}*/
	
}

