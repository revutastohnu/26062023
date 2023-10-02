package hw17;

public class FileMaxSizeReachedException extends Exception {
    public FileMaxSizeReachedException(long maxSize, long currentSize, String file) {
        super(String.format("Max size: %d, Current size: %d, File: %s", maxSize, currentSize, file));
    }
}
