package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.command.ComplexCommand;
import edu.kis.powp.jobs2d.command.factory.CoolSFactory;
import edu.kis.powp.jobs2d.command.factory.KiteFactory;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

	private DriverManager driverManager;
    private final int figNum;
    private CoolSFactory coolSFactory = new CoolSFactory();
    private KiteFactory kiteFactory = new KiteFactory();

	public SelectTestFigureOptionListener(DriverManager driverManager, int figureNumber) {
        figNum = figureNumber;
		this.driverManager = driverManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
        ComplexCommand command;
        switch(figNum) {
            case 1:
                FiguresJoe.figureScript1(driverManager.getCurrentDriver());
                break;
            case 2:
                FiguresJoe.figureScript2(driverManager.getCurrentDriver());
                break;
            case 3:
                command = coolSFactory.createCoolSCommand(driverManager.getCurrentDriver());
                command.execute();
                break;
            case 4:
                command = kiteFactory.createKiteCommand(driverManager.getCurrentDriver());
                command.execute();
                break;
            default:
                break;
        }
	}
}
