package hw17;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileLoggerConfigurationLoader {
    public FileLoggerConfiguration load(String filePath) throws IOException {
        FileLoggerConfiguration config = new FileLoggerConfiguration();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
            }
        }
        return config;
    }
}
