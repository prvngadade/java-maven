import java.util.logging.Logger;

public class HelloWorld {
    // Create a logger instance
    private static final Logger LOGGER = Logger.getLogger(HelloWorld.class.getName());

    // Your program begins with a call to main().
    // Prints "Hello, World" to the terminal window.
    public static void main(String[] args) {
        // Use the logger to log the message
        LOGGER.info("Hello, World");
    }
}
