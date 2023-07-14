package HW4;

public class Cat extends Animal {
    private static int catCount = 0;
    private static final int MAX_RUN_DISTANCE = 200;
    public Cat() {
        super();
        catCount++;
    }
    @Override
    public void run(int runDistance) {
if (runDistance <= MAX_RUN_DISTANCE){
            System.out.println("Кіт пробіг "+runDistance+" метрів"+"\n");
    } else System.out.println("Кіт "+runDistance+" метрів пробігти не може"+"\n");
    }
    @Override
    public void swim(int swimDistance) {
        System.out.println("Коти не вміють плавати"+"\n");
    }
    public static int getCatCount() {
        return catCount;
    }
}
