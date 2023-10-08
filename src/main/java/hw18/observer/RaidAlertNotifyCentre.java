package hw18.observer;

import java.util.ArrayList;
import java.util.List;

public class RaidAlertNotifyCentre implements NotifyCentre{
    private List<AlertsObserver> observers = new ArrayList<>();

    private boolean state;
@Override
    public void setState(boolean state) {
        this.state = state;
        notifyObservers();
    }
@Override
    public void addObserver(AlertsObserver o) {
        observers.add(o);
    }
@Override
    public void removeObserver(AlertsObserver o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        for (AlertsObserver o : observers) o.update(state);
    }
}
