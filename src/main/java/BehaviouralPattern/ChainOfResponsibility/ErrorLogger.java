package BehaviouralPattern.ChainOfResponsibility;

public class ErrorLogger extends AbstractLogger{

    public ErrorLogger(int level) {
        this.level = level;
    }

    protected void writeLogs(String message) {
        System.out.println("Error: --> "+ message);
    }

}
