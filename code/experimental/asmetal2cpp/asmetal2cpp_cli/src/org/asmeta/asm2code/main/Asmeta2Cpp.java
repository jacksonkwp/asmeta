package org.asmeta.asm2code.main;

import java.io.File;
import java.io.FileNotFoundException;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.asmeta.asm2code.compiler.CompileResult;
import org.asmeta.simulator.Environment;
import org.asmeta.simulator.Environment.TimeMngt;
import org.asmeta.simulator.InvalidInvariantException;
import org.asmeta.simulator.UpdateClashException;
import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.Option;

import asmeta.cli.ASMFileFilter;
import asmeta.cli.AsmetaCLI;

/** main class to build the program Asmeta2Cpp */

public class Asmeta2Cpp extends AsmetaCLI {

	
	@Option(name = "-optimizeseq", usage = "optimize the tranlsation of seq rule")
	boolean optmizeSeqRule;
	
	@Option(name = "-arduino", usage = "generate the code for arduino")
	boolean arduinoCompiler;
	
/*	private boolean shuffle;

	@Option(name = "-rnd", usage = "random simulation")
	private boolean rndSimulation;

	@Option(name = "-env", usage = "the environment file ")
	private String envPath;

	@Option(name = "-ne", usage = "run until the update set is empty")
	private boolean runUntilEmpty;

	@Option(name = "-nt", usage = "run until the update set is trivial")
	private boolean runUntilTrivial;

	// @Option(name = "-cov", usage = "run until update set is empty")
	// private boolean coverage;

	@Option(name = "-n", usage = "run for n steps (100 default)")
	private int nSteps = 100;
	
	
	@Option(name = "-systemtime", usage = "use the time from the system")
	private boolean systemtime = false;
*/
	/**
	 * Entry point of the program.
	 * 
	 * @param args
	 *            command line arguments
	 * @throws Throwable
	 */
	public static void main(String[] args) throws Throwable {
		ClassLoader.getSystemClassLoader().setDefaultAssertionStatus(true);
		Asmeta2Cpp asmeta2cpp = new Asmeta2Cpp();
		asmeta2cpp.run(args);
	}

	/**
	 * Stampa un messaggio d'errore e termina il programma.
	 * 
	 * @param msg
	 *            messaggio d'errore
	 */
	static private void error(String msg) {
		// System.out.println(msg);
		// System.exit(-1);
		throw new RuntimeException(msg);
	}

	@Override
	protected void runWith(File asmFile) throws CmdLineException {
		ASMFileFilter filter = new ASMFileFilter();
		if (!filter.accept(asmFile)) {
			throw new CmdLineException("Error:  " + asmFile.toString() + " is not an asm file.");
		}
		try {
			if (debug) {
				Logger.getLogger("org.asmeta.parser").setLevel(Level.ALL);
				Logger.getLogger("org.asmeta.asm2code").setLevel(Level.ALL);				
			}
			TranslatorOptions options = new TranslatorOptions(false, true, optmizeSeqRule, arduinoCompiler);
			AsmetaL2CppGeneratorMain.test(asmFile.toString(),options);
		} catch (FileNotFoundException e) {
			error("Error: file not found " + e.getMessage());
/*		} catch (AsmModelNotFoundException e) {
			error("Error: model not found " + e.getMessage());
		} catch (MainRuleNotFoundException e) {
			error("Error: main rule not found " + e.getMessage());*/
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
