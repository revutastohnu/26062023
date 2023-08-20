package coffee.order;

public class Order {
    int number;
    String name;

    public Order(int number, String name) {
        this.number = number;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Num: " + number + " | Name: " + name;
    }
}

