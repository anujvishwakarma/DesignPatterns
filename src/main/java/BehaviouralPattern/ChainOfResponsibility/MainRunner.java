package BehaviouralPattern.ChainOfResponsibility;

public class MainRunner {

    public static AbstractLogger getLogger () {
        AbstractLogger infoLogger = new InfoLogger(1);
        AbstractLogger debugLogger =  new DebugLogger(2);
        AbstractLogger errorLogger = new ErrorLogger(3);
        infoLogger.setNextLogger(debugLogger);
        debugLogger.setNextLogger(errorLogger);
        errorLogger.setNextLogger(null);
        return infoLogger;
    }

    public static void main(String[] args) {
        AbstractLogger logger = getLogger();
        logger.logMessage(AbstractLogger.INFO, "Hello World");
        logger.logMessage(AbstractLogger.ERROR, "Hello World");
    }
}
