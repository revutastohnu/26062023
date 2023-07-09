package HW3;

public class Burger {
    public final String bun;
    public final String meat;
    public final String cheese;
    public final String vegetables;
    public final String sause;

    public Burger() // стандартний бургер
    {
        this.bun = "стандартна булочка з кунжутом";
        this.meat = "Курка";
        this.cheese = "Чеддер";
        this.vegetables = "Листок салату та огірок";
        this.sause = "з майонезом";
        displayIngredients();
    }
    public Burger(String bun, String meat, String cheese, String salad) // дієтичний бургер
    {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.vegetables = salad;
        this.sause = "дієтичний соус";
        displayIngredients();
    }
    public Burger(String bun, String meat, String cheese) // подвійне м'ясо
    {
        this.bun = bun;
        this.meat = meat + "подвійне";
        this.cheese = cheese;
        this.vegetables = "";
        this.sause = "з майонезом";
        displayIngredients();
    }

    public void displayIngredients(){
        System.out.println("Склад вашого бургера:");
        System.out.println("Булочка: " + bun);
        System.out.println("М'ясо: " + meat);
        System.out.println("Сир: " + cheese);
        System.out.println("Додатково: " + vegetables);
        System.out.println("Соус: " + sause);
        System.out.println();
    }
    }



