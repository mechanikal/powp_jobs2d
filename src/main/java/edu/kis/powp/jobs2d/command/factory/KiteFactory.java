package edu.kis.powp.jobs2d.command.factory;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.command.ComplexCommand;
import edu.kis.powp.jobs2d.command.OperateToCommand;
import edu.kis.powp.jobs2d.command.SetPositionCommand;

public class KiteFactory {
    public ComplexCommand createKiteCommand(Job2dDriver driver) {
        ComplexCommand command = new ComplexCommand();
        command.addCommand(new SetPositionCommand(0,100,driver));
        command.addCommand(new OperateToCommand(-80,-20,driver));
        command.addCommand(new OperateToCommand(0,-100,driver));
        command.addCommand(new OperateToCommand(0,100,driver));
        command.addCommand(new OperateToCommand(20,120,driver));
        command.addCommand(new OperateToCommand(-20,120,driver));
        command.addCommand(new OperateToCommand(0,100,driver));
        command.addCommand(new OperateToCommand(80,-20,driver));
        command.addCommand(new OperateToCommand(0,-100,driver));
        command.addCommand(new SetPositionCommand(80,-20,driver));
        command.addCommand(new OperateToCommand(-80,-20,driver));
        return command;
    }
}
