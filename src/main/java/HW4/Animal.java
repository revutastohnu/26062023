package HW4;

public abstract class Animal {
    private static int animalCount = 0;
    public abstract void run(int runDistance);
    public abstract void swim(int swimDistance);
    public Animal() {
        animalCount++;
    }
    public static int getAnimalCount() {
        return animalCount;
    }
}
