package hw22;

public class App {
    public static void main(String[] args) throws InterruptedException {

        GasStation gasStation = new GasStation(100);


        new Thread(() -> gasStation.refuel()).start();
        new Thread(() -> gasStation.refuel()).start();

        // добавляємо авто в чергу
        for (int i = 0; i < 1000; i++) {
            Car car = new Car("Car " + i, 20 + i * 2, 50);
            gasStation.addToQueue(car);
        }

    }
    }

