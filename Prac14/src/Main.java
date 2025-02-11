public class Main {
    public static void main(String[] args) {
        LogHandler debugHandler = new DebugLogHandler();
        LogHandler infoHandler = new InfoLogHandler();
        LogHandler warningHandler = new WarningLogHandler();
        LogHandler errorHandler = new ErrorLogHandler();
        LogHandler criticalHandler = new CriticalLogHandler();

        debugHandler.setNextHandler(infoHandler);
        infoHandler.setNextHandler(warningHandler);
        warningHandler.setNextHandler(errorHandler);
        errorHandler.setNextHandler(criticalHandler);

        debugHandler.logMessage(LogLevel.DEBUG, "Это отладочное сообщение");
        debugHandler.logMessage(LogLevel.INFO, "Это информационное сообщение");
        debugHandler.logMessage(LogLevel.WARNING, "Это предупреждение");
        debugHandler.logMessage(LogLevel.ERROR, "Это сообщение об ошибке");
        debugHandler.logMessage(LogLevel.CRITICAL, "Это критическое сообщение");
    }
}