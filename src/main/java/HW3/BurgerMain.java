package HW3;

public class BurgerMain {
    public static void main(String[] args) {
        Burger regularBurger = new Burger();
        Burger dieteticBurger = new Burger("без майонезу");
        Burger doubleMeatBurger = new Burger(2);
    }
}
