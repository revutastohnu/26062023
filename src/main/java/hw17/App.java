package hw17;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws FileMaxSizeReachedException, IOException {
        FileLoggerConfiguration config = new FileLoggerConfiguration();
        config.setFile("src/main/java/hw17/logs");
        config.setLoggingLevel(LoggingLevel.DEBUG);
        config.setMaxSize(1024 * 1024);
        config.setFormat("[CURRENT_TIME][LEVEL] Message: [MESSAGE]");

        FileLogger fileLogger = new FileLogger(config);

        fileLogger.info("This is an info message.");
        fileLogger.debug("This is a debug message.");
    }
}
