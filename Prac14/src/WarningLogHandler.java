public class WarningLogHandler extends LogHandler {
    public WarningLogHandler() {
        super(LogLevel.WARNING);
    }

    @Override
    protected void write(String message) {
        System.out.println("WARNING: " + message);
    }
}