package edu.kis.powp.jobs2d.command.factory;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.command.ComplexCommand;
import edu.kis.powp.jobs2d.command.OperateToCommand;
import edu.kis.powp.jobs2d.command.SetPositionCommand;

public class CoolSFactory {
    public ComplexCommand createCoolSCommand(Job2dDriver driver){
        ComplexCommand command = new ComplexCommand();
        command.addCommand(new SetPositionCommand(0,80,driver));
        command.addCommand(new OperateToCommand(0,20,driver));
        command.addCommand(new OperateToCommand(-40,20,driver));
        command.addCommand(new OperateToCommand(-40,80,driver));
        command.addCommand(new OperateToCommand(0,120,driver));
        command.addCommand(new OperateToCommand(40,80,driver));
        command.addCommand(new OperateToCommand(40,20,driver));
        command.addCommand(new OperateToCommand(0,-20,driver));

        command.addCommand(new OperateToCommand(40,-20,driver));
        command.addCommand(new OperateToCommand(40,-80,driver));
        command.addCommand(new OperateToCommand(0,-120,driver));
        command.addCommand(new OperateToCommand(-40,-80,driver));
        command.addCommand(new OperateToCommand(-40,-20,driver));
        command.addCommand(new OperateToCommand(0,20,driver));
        command.addCommand(new SetPositionCommand(0,-80,driver));
        command.addCommand(new OperateToCommand(0,-20,driver));
        return command;
    }
}
