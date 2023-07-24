package HW7;

public class App {
    public static void main(String[] args) {
        String[][] array = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "hello", "15" }
        };

        ArrayCalculator calculator = new ArrayCalculator();
       System.out.println(calculator.doCalc(array));

    }
}
