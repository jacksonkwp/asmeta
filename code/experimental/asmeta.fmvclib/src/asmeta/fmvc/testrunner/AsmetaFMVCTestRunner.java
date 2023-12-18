package asmeta.fmvc.testrunner;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Scanner;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;

import org.apache.commons.lang3.reflect.FieldUtils;

import asmeta.fmvclib.annotations.AsmetaControlledLocation;
import asmeta.fmvclib.annotations.AsmetaMonitoredLocation;
import asmeta.fmvclib.view.AsmetaFMVCView;

/**
 * The AsmetaFMVCTestRunner class
 * 
 * @author Andrea Bombarda
 */
public class AsmetaFMVCTestRunner {

	/**
	 * The view
	 */
	AsmetaFMVCView view;

	/**
	 * The path of the AVALLA scenario to be executed
	 */
	String scenario;

	/**
	 * The constructor
	 * 
	 * @param view       the view
	 * @param scenario   the path of the scenario
	 */
	public AsmetaFMVCTestRunner(AsmetaFMVCView view, String scenario) {
		super();
		this.view = view;
		this.scenario = scenario;
	}

	/**
	 * The method running the test from the avalla scenario
	 * 
	 * @throws IOException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 */
	public void runTest() throws IOException, IllegalArgumentException, IllegalAccessException {
		Scanner scanner = new Scanner(new File(this.scenario));

		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();

			if (line.startsWith("//"))
				// Comment, skip
				continue;

			if (line.startsWith("scenario "))
				// Initial line of the scenario, skip
				continue;

			if (line.startsWith("load "))
				// ASM loading instruction, skip
				continue;

			if (line.startsWith("step"))
				// Step instruction, skip
				continue;

			if (line.startsWith("check "))
				// Check instruction
				runCheck(line.replace("check ", "").replace(";", ""));

			if (line.startsWith("set "))
				// Set instruction
				runSet(line.replace("set ", "").replace(";", ""));
		}

		scanner.close();

	}

	/**
	 * Executes the check
	 * 
	 * @param line
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 */
	private void runCheck(String line) throws IllegalArgumentException, IllegalAccessException {
		// Check execution
		System.out.println("Executing check: " + line);
		
		// Extract the name and the value of the location
		String locationName = line.split(" = ")[0];
		String locationValue = line.split(" = ")[1];

		// Find the object annotated with the locationName
		Field locationNameAnnotation = FieldUtils
				.getFieldsListWithAnnotation(view.getClass(), AsmetaControlledLocation.class).stream()
				.filter(x -> x.getAnnotation(AsmetaControlledLocation.class).asmLocationName()
						.equals(locationName.split("\\(")[0]))
				.findFirst().orElse(null);

		// Check the value, depending on the object type
		if (locationNameAnnotation != null) {
			locationNameAnnotation.setAccessible(true);
			Object obj = locationNameAnnotation.get(view);

			try {
				if (obj instanceof JTextField) {
					((JTextField) obj).getText().equals(locationValue);
				} else if (obj instanceof JLabel) {
					assert ((JLabel) obj).getText().equals(locationValue);
				} else if (obj instanceof JTable) {
					// Since it is a table, the location name must contain the index
					assert locationName.contains("(");
					JTable table = ((JTable) obj);
					
					// ASMETA undef is Java empty string
					if (locationValue.equals("undef"))
						locationValue = "";
					
					// Extract the index
					int index = Integer.parseInt(locationName.split("\\(")[1].split("\\)")[0]) - 1;
					assert (locationValue.equals(table.getModel().getValueAt(index,  0)));
				} else {
					throw new RuntimeException("This type of component is not yet supported by the fMVC framework: "
							+ obj.getClass());
				}
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * Executes the set
	 * 
	 * @param line
	 */
	private void runSet(String line) {
		// Check execution
		System.out.println("Executing set: " + line);
		
		// Extract the name and the value of the location
		String locationName = line.split(" := ")[0];
		String locationValue = line.split(" := ")[1];
		
		// Find the object annotated with the locationName
		Field locationNameAnnotation = FieldUtils
				.getFieldsListWithAnnotation(view.getClass(), AsmetaMonitoredLocation.class).stream()
				.filter(x -> x.getAnnotation(AsmetaMonitoredLocation.class).asmLocationName()
						.equals(locationName.split("\\(")[0]))
				.findFirst().orElse(null);
		
		System.out.println(locationNameAnnotation);

	}

}
