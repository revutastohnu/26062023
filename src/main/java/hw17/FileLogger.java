package hw17;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileLogger {
    private FileLoggerConfiguration config;

    public FileLogger(FileLoggerConfiguration config) {
        this.config = config;
    }

    private void log(String message, LoggingLevel level) throws IOException, FileMaxSizeReachedException {
        if (!config.getLoggingLevel().allowsLogging(level)) {
            return;
        }

        String formattedMessage = String.format("[%s][%s] Message: %s",
                new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()),
                level.toString(),
                message);

        File logFile = new File(config.getFile());
        if (logFile.length() + formattedMessage.length() > config.getMaxSize()) {
            throw new FileMaxSizeReachedException(config.getMaxSize(), logFile.length(), config.getFile());
        }

        try (FileWriter writer = new FileWriter(logFile, true)) {
            writer.write(formattedMessage + "\n");
        }
}

    public void debug(String message) throws IOException, FileMaxSizeReachedException {
        log(message, LoggingLevel.DEBUG);
    }

    public void info(String message) throws IOException, FileMaxSizeReachedException {
        log(message, LoggingLevel.INFO);
    }
}