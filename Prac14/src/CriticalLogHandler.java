public class CriticalLogHandler extends LogHandler {
    public CriticalLogHandler() {
        super(LogLevel.CRITICAL);
    }

    @Override
    protected void write(String message) {
        System.out.println("CRITICAL: " + message);
    }
}