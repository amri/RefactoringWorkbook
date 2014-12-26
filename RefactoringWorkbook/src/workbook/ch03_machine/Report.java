package workbook.ch03_machine;

import java.util.*;
import java.io.*;

public class Report {
	public static void report(Writer writer, List<Machine> machines, Robot robot)
			throws IOException {

		writer.write("FACTORY REPORT\n");

		printAllMachines(writer, machines);
		printAllRobot(writer, robot);
		
		writer.write("========\n");
	}

	private static void printAllRobot(Writer writer, Robot robot)
			throws IOException {
		writer.write("Robot");

		if (robot.location() != null)
			writer.write(" location=" + robot.location().name());

		if (robot.bin() != "")
			writer.write(" bin=" + robot.bin());

		writer.write("\n");

	}

	private static void printAllMachines(Writer writer, List<Machine> machines)
			throws IOException {

		Iterator<Machine> line = machines.iterator();
		while (line.hasNext()) {
			Machine machine = (Machine) line.next();
			writer.write("Machine " + machine.name());

			if (machine.bin() != null)
				writer.write(" bin=" + machine.bin());

			writer.write("\n");
		}
		writer.write("\n");
	}
}