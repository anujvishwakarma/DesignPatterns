package BehaviouralPattern.ChainOfResponsibility;

public abstract class AbstractLogger {

    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    protected int level;

    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String message){
        if(this.level<=level){
            writeLogs(message);
        }
        if(nextLogger!=null){
            this.nextLogger.logMessage(level, message);
        }
    }

    abstract protected void writeLogs(String message);
}
