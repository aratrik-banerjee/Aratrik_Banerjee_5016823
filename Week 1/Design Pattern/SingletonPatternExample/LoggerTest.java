public class LoggerTest {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // Test to check if both logger1 and logger2 are the same instance
        if (logger1 == logger2) {
            System.out.println("Both logger1 and logger2 are the same instance.");
        } else {
            System.out.println("Different instances are created.");
        }

        // Logging messages
        logger1.log("This is the first log message.");
        logger2.log("This is the second log message.");
    }
}
