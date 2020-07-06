package BehaviouralPattern.ChainOfResponsibility;

public class InfoLogger extends AbstractLogger{

    public InfoLogger(int level) {
        this.level = level;
    }

    protected void writeLogs(String message) {
        System.out.println("Info: --> "+ message);
    }

}
