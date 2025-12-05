package structural.chainofresponsibility;

public class Main {

    private static Logger doChaining() {
        Logger consoleLogger = new ConsoleBasedLogger(Logger.OUTPUT_INFO);

        Logger errorLogger = new ErrorBasedLogger(Logger.ERROR_INFO);
        consoleLogger.setNextLevelLogger(errorLogger);

        Logger debugLogger = new DebugBasedLogger(Logger.DEBUG_INFO);
        errorLogger.setNextLevelLogger(debugLogger);

        return consoleLogger;
    }

    public static void main(String[] args) {
        Logger chainLogger = doChaining();

        chainLogger.logMessage(Logger.OUTPUT_INFO, "Enter the sequence of values ");
        chainLogger.logMessage(Logger.ERROR_INFO, "An error is occurred now");
        chainLogger.logMessage(Logger.DEBUG_INFO, "This was the error now debugging is compiled");
    }
}