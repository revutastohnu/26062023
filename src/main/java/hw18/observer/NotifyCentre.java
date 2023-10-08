package hw18.observer;
import javax.lang.model.type.NoType;
import java.util.Observer;

public interface NotifyCentre{

    void setState(boolean state);

    void addObserver(AlertsObserver  observer);
    void removeObserver(AlertsObserver observer);
    void notifyObservers();
}
