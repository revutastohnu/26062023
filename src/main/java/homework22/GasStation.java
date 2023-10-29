package homework22;

import java.util.LinkedList;
import java.util.Queue;

public class GasStation {
    private final Queue<Car> queue = new LinkedList<>();
    private volatile int fuelTank;

    public GasStation(int fuelTank) {
        this.fuelTank = fuelTank;
    }

    public synchronized void addToQueue(Car car) {
        queue.add(car);
        notifyAll();
    }

    public synchronized void refuel() {
        while (true) {
            while (queue.isEmpty() || fuelTank <= 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
            Car car = queue.poll();
            int neededFuel = car.getNeededFuel();
            if (fuelTank >= neededFuel) {
                fuelTank -= neededFuel;
                car.refuel(neededFuel);
                System.out.println("Refueled " + car.getName());
            } else {
                System.out.println("Not enough fuel for " + car.getName());
            }
        }
    }
}
