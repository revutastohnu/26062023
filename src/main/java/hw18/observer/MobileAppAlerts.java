package hw18.observer;

public class MobileAppAlerts implements AlertsObserver {
    @Override
    public void update(boolean state) {
        System.out.println("Raid alert in your region is now " + state);
    }
}
