package HW5;

public class Drone {
    private String name;
    private int price;
    private Weapon weapon;

    public enum Weapon {
        ROCKET,
        GRENADE,
        MINE
    }

    private Drone(String name, int price, Weapon weapon) {
        this.name = name;
        this.price = price;
        this.weapon = weapon;
    }

    public static class Builder {
        private String name;
        private int price;
        private Weapon weapon;

        public Builder() {
        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withPrice(int price) {
            this.price = price;
            return this;
        }

        public Builder withWeapon(Weapon weapon) {
            this.weapon = weapon;
            return this;
        }

        public Drone build() {
            return new Drone(name, price, weapon);
        }
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public Weapon getWeapon() {
        return weapon;
    }
}