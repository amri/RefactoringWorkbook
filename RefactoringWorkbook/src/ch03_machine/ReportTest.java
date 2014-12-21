package ch03_machine;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;

import org.junit.Test;

public class ReportTest {
    @Test
    public void testReport() throws IOException {
        ArrayList<Machine> machines = new ArrayList<Machine>();
        machines.add(new Machine("mixer", "left"));

        Machine extruder = new Machine("extruder", "center");
        extruder.put("paste");
        machines.add(extruder);

        Machine oven = new Machine("oven", "right");
        oven.put("chips");
        machines.add(oven);

        Robot robot = new Robot();
        robot.moveTo(extruder);
        robot.pick();

        StringWriter writer = new StringWriter();
        Report.report(writer, machines, robot);

        String expected =
            "FACTORY REPORT\n" +
            "Machine mixer\n"+
            "Machine extruder\n" +
            "Machine oven bin=chips\n\n" +
            "Robot location=extruder bin=paste\n" +
            "========\n";

        assertEquals(expected, writer.toString());
    }
}

