package hw21;

import java.io.FileWriter;
import java.io.IOException;

public class WordCounterRunnable implements Runnable {
    private final String content;

    public WordCounterRunnable(String content) {
        this.content = content;
    }

    @Override
    public void run() {
        String[] words = content.split("\\s+");
        try (FileWriter writer = new FileWriter("src/main/java/hw21/WordCount.txt")) {
            writer.write("Number of words: " + words.length);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
