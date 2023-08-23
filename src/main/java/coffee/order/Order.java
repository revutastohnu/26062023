package coffee.order;

public class Order {
   private int number;
    private String name;

    public Order(int number, String name) {
        this.number = number;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Num: " + number + " | Name: " + name;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }
}

