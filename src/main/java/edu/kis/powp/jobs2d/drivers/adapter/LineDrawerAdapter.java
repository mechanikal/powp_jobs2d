package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.jobs2d.Job2dDriver;



public class LineDrawerAdapter extends DriverToDrawerAdapter {
    private int lineType;
    public LineDrawerAdapter() {
        lineType = 0;
    }
    public void setLineType(int lineType) {
        this.lineType = lineType;
    }
    @Override
    public void operateTo(int x, int y) {
        ILine line;
        switch (lineType) {
            case 1:
                line = LineFactory.getDottedLine();
                break;
            case 2:
                line = LineFactory.getSpecialLine();
                break;
            default:
                line = LineFactory.getBasicLine();
        }
        line.setStartCoordinates(this.getStartX(), this.getStartY());
        line.setEndCoordinates(x, y);
        setPosition(x,y);
        this.getDrawPanelController().drawLine(line);
    }
}
