package coffee.order;
import java.util.ArrayList;
import java.util.List;

public class CoffeeOrderBoard{
    private List<Order> orders;
    private int nextOrderNumber;

    public CoffeeOrderBoard() {
        orders = new ArrayList<>();
        nextOrderNumber = 1;
    }

    public void add(String name) {
        orders.add(new Order(nextOrderNumber, name));
        nextOrderNumber++;
    }

    public void deliver() {
        if (!orders.isEmpty()) {
            orders.remove(0);
        }
    }

    public void deliver(int orderNumber) {
        orders.removeIf(order -> order.getNumber() == orderNumber);
    }

    public void draw() {
        System.out.println("=============");
        System.out.println("Num | Name");
        for (Order order : orders) {
            System.out.println(order.getNumber() + "   | " + order.getName());
        }
    }
}

