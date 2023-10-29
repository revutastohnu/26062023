package hw23;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        ValueCalculator calculator = new ValueCalculator(1000000);
        calculator.calculateValues();

    }
}