public class Logger {
    // Private static instance of Logger class
    private static Logger instance;

    // Private constructor to prevent instantiation from other classes
    private Logger() {}

    // Public static method to provide access to the instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Method to log messages
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
