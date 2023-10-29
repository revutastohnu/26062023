package homework22;

public class Car {
    private String name;
    private int fuel;
    private int tankCapacity;

    public Car(String name, int fuel, int tankCapacity) {
        this.name = name;
        this.fuel = fuel;
        this.tankCapacity = tankCapacity;
    }

    public String getName() {
        return name;
    }

    public int getNeededFuel() {
        return tankCapacity - fuel;
    }

    public void refuel(double amount) {
        this.fuel += amount;
        if (this.fuel > tankCapacity) {
            this.fuel = tankCapacity;
        }
    }
}
