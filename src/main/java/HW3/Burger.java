package HW3;

public class Burger {
    public final String bun;
    public final int meatQuantity;
    public final String cheese;
    public final String vegetables;
    public final String sause;
    public Burger(String bun, int meatQuantity, String cheese, String vegetables, String sause) // конструктор
    {
        this.bun = bun;
        this.meatQuantity = meatQuantity;
        this.cheese = cheese;
        this.vegetables = vegetables;
        this.sause = sause;

    }
    public Burger() // стандартний бургер
    {
        this("булочка з кунжутом", 1, "Чеддер", "Листок салату та оігрок", "з майонезом");
        displayIngredients();
    }
    public Burger(String sause) // дієтичний бургер
    {
        this("булочка з кунжутом",  1 , "Чеддер","Листок салату та огірок", sause);
        displayIngredients();
    }

    public Burger(int meatQuantity) // з подвійним м'ясом
    {
        this("Булочка з кунжутом", meatQuantity, "Чеддер", "Листок салату та огірок", "з майонезом");
        displayIngredients();
    }
    public void displayIngredients(){
        System.out.println("Склад вашого бургера:"+ "\n");
        System.out.println("Булочка: " + bun);
        if (this.meatQuantity == 1){
            System.out.println("М'ясо: " + meatQuantity + " котлета");
        } else System.out.println("М'ясо: " + meatQuantity + " котлети");
        System.out.println("Сир: " + cheese);
        System.out.println("Додатково: " + vegetables);
        System.out.println("Соус: " + sause);
        System.out.println();
    }
    }



