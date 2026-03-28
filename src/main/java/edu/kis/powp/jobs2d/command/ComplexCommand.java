package edu.kis.powp.jobs2d.command;
import java.util.ArrayList;

public class ComplexCommand implements DriverCommand {
    private ArrayList<DriverCommand> driverCommands = new ArrayList<>();

    public void addCommand(DriverCommand driverCommand){
        driverCommands.add(driverCommand);
    }

    public void execute() {
        for (DriverCommand driverCommand : driverCommands) {
            driverCommand.execute();
        }
    }
}
