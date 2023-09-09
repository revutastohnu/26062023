package HW14;
import java.time.LocalDate;

public class Product {
        private double price;
        private boolean discount;
        private LocalDate createDate;
        private int id;
        private static int nextId = 1;
        private Type type;

    public enum Type {
            BOOK,
            BACKPACK,
            TOY
    }

    public Product(Type type, double price, boolean discount, LocalDate createDate, int id) {
        this.createDate = LocalDate.now();
        this.id = nextId++;
    }

    public Product(Type type, double price, boolean discount) {
        this.id = nextId++;
        this.type = type;
        this.price = price;
        this.discount = discount;
        this.createDate = LocalDate.now();
    }

    public Type getType() { return type; }

    public double getPrice() {
        return price;
    }

    public boolean isDiscount() {
        return discount;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public int getId() {
        return id;
    }
}
