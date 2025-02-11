public class ErrorLogHandler extends LogHandler {
    public ErrorLogHandler() {
        super(LogLevel.ERROR);
    }

    @Override
    protected void write(String message) {
        System.out.println("ERROR: " + message);
    }
}