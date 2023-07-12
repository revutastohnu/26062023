package HW4;

public class Dog extends Animal {
    private static int dogCount;
    private static final int MAX_RUN_DISTANCE = 500;
    private static final int MAX_SWIM_DISTANCE = 10;
    public Dog() {
        super();
        dogCount++;
    }
    @Override
    public void run(int runDistance) {
        if (runDistance <= MAX_RUN_DISTANCE){
            System.out.println("Собака пробігла "+runDistance+" метрів"+"\n");
        } else System.out.println("Собака "+runDistance+" метрів пробігти не може"+"\n");
    }

    @Override
    public void swim(int swimDistance) {
        if (swimDistance <= MAX_SWIM_DISTANCE)
        {
            System.out.println("Собака проплила "+swimDistance+" метрів"+"\n");
        } else System.out.println("Собака "+swimDistance+" метрів плисти не може"+"\n");
    }
    public static int getDogCount() {
        return dogCount;
    }
}
