package BehaviouralPattern.ChainOfResponsibility;

public class DebugLogger extends AbstractLogger{

    public DebugLogger(int level) {
        this.level = level;
    }

    protected void writeLogs(String message) {
        System.out.println("Debug: --> "+ message);
    }
}
