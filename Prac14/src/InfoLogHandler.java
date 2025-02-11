public class InfoLogHandler extends LogHandler {
    public InfoLogHandler() {
        super(LogLevel.INFO);
    }

    @Override
    protected void write(String message) {
        System.out.println("INFO: " + message);
    }
}