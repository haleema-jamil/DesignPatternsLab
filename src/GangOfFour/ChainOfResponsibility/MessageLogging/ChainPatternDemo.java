package GangOfFour.ChainOfResponsibility.MessageLogging;

public class ChainPatternDemo {

    private static AbstractLogger getChainOfLoggers() {

        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
        AbstractLogger DatabaseLogger = new DatabaseLogger(AbstractLogger.WARNING);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);
        consoleLogger.setNextLogger(DatabaseLogger);

        return DatabaseLogger;
    }

    private static AbstractLogger getChainOfLoggers2() {

        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger DatabaseLogger = new DatabaseLogger(AbstractLogger.WARNING);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(DatabaseLogger);
        DatabaseLogger.setNextLogger(consoleLogger);

        return DatabaseLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.INFO,
                "This is an information.");

        loggerChain.logMessage(AbstractLogger.DEBUG,
                "This is an debug level information.");

        loggerChain.logMessage(AbstractLogger.ERROR,
                "This is an error information.");

        loggerChain.logMessage(AbstractLogger.WARNING,
                "This is a warning information.");

        AbstractLogger loggerChain2 = getChainOfLoggers2();
        
        loggerChain2.logMessageOnce(AbstractLogger.INFO,
                "This is an information.");

        loggerChain2.logMessage(AbstractLogger.DEBUG,
                "This is an debug level information.");

        loggerChain2.logMessage(AbstractLogger.ERROR,
                "This is an error information.");

        loggerChain2.logMessage(AbstractLogger.WARNING,
                "This is a warning information.");

    }
}
