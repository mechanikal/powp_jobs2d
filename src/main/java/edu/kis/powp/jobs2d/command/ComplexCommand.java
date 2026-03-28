package edu.kis.powp.jobs2d.command;
import java.util.ArrayList;

public class ComplexCommand {
    private ArrayList<DriverCommand> driverCommands = new ArrayList<>();

    public void addCommand(DriverCommand driverCommand){
        driverCommands.add(driverCommand);
    }

    public void setCommands(ArrayList<DriverCommand> driverCommands){
        this.driverCommands = driverCommands;
    }

    public ArrayList<DriverCommand> getCommands(){
        return this.driverCommands;
    }

    public void execute() {
        for (DriverCommand driverCommand : driverCommands) {
            driverCommand.execute();
        }
    }
}
