package HW3;

public class BurgerMain {
    public static void main(String[] args) {
        Burger regularBurger = new Burger();
        Burger dietBurger = new Burger("Булочка без кунжуту", "Курка", "Чеддер", "Помідор та томати");
        Burger doubleMeatBurger = new Burger("Стандартна булочка з кунжутом", "Яловичина", "Чеддер");
    }
}
