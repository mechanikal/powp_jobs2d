

public class SetPositionCommand implements DriverCommand {
    private int x;
    private int y;

    public SetPositionCommand(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public execute(Job2dDriver driver) {
        driver.setPosition(x, y);
    }
}