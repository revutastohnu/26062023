package hw17;
import java.io.IOException;

public interface Logger {
    void debug(String message) throws IOException, FileMaxSizeReachedException;
    void info(String message) throws IOException, FileMaxSizeReachedException;
}
