

public class OperateToCommand implements DriverCommand {
    private int x;
    private int y;

    public OperateToCommand(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public execute(Job2dDriver driver) {
        driver.operateTo(x, y);
    }
}