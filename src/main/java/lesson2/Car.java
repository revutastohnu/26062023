package lesson2;

public class Car {
    public void start() {
        startElectricity();
        startCommand();
        startFuelSystem();
    }

    private void startElectricity() {
        System.out.println("Starting electricity system...");
    }

    private void startCommand() {
        System.out.println("Executing start command...");
    }

    private void startFuelSystem() {
        System.out.println("Starting fuel system...");
    }
}
