package hw18;

import hw18.decorator.BlackTea;
import hw18.decorator.MilkTea;
import hw18.decorator.Tea;
import hw18.observer.MobileAppAlerts;
import hw18.observer.RaidAlertNotifyCentre;


public class App {
    public static void main(String[] args) {
        Tea tea = new BlackTea();
        System.out.println("Cost of black tea: " + tea.cost());
        System.out.println(tea.description());

        Tea milkTea = new MilkTea(tea);
        System.out.println("Cost of black tea with milk: " + milkTea.cost());
        System.out.println(milkTea.description());

        /////

        RaidAlertNotifyCentre notifyCentre = new RaidAlertNotifyCentre();
        MobileAppAlerts myApp = new MobileAppAlerts();

        notifyCentre.addObserver(myApp);

        notifyCentre.setState(false);  // Observer received state: 1
        notifyCentre.setState(true);  // Observer received state: 2
    }
}
