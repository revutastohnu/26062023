package hw21;

import java.io.FileWriter;
import java.io.IOException;

public class UniqueCharsRunnable implements Runnable {
    private final String content;

    public UniqueCharsRunnable(String content) {
        this.content = content;
    }

    @Override
    public void run() {
        String uniqueChars = content.replaceAll("(.)(?=.*\\1)", "");
        try (FileWriter writer = new FileWriter("src/main/java/hw21/UniqueChars.txt")) {
            writer.write("Unique characters: " + uniqueChars);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
