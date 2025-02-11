public class DebugLogHandler extends LogHandler {
    public DebugLogHandler() {
        super(LogLevel.DEBUG);
    }

    @Override
    protected void write(String message) {
        System.out.println("DEBUG: " + message);
    }
}