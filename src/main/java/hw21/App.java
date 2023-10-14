package hw21;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;


public class App {

    public static void main(String[] args) {
        StringBuilder content = new StringBuilder();

        try (Reader reader = new FileReader("src/main/java/hw21/hello.txt")) {
            int ch;
            while ((ch = reader.read()) != -1) {
                content.append((char) ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        Thread wordCounter = new Thread(new WordCounterRunnable(content.toString()));
        Thread uniqueChars = new Thread(new UniqueCharsRunnable(content.toString()));
        Thread charFrequency = new Thread(new CharFrequencyRunnable(content.toString()));


        wordCounter.start();
        uniqueChars.start();
        charFrequency.start();
    }
}