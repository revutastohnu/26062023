package HW4;

public class App {
    public static void main(String[] args) {
    Cat cat = new Cat();
    Dog dog = new Dog();
    Dog bobik = new Dog();

    dog.swim(200);
    dog.swim(5);
    bobik.run(500);
    dog.run(1000);

    cat.swim(1);
    cat.run(200);
    cat.run(201);
    System.out.println(Dog.getDogCount()+" собак було створено"+"\n");
    System.out.println(Cat.getCatCount()+" котів було створено"+"\n");
    System.out.println(Animal.getAnimalCount()+ " тварин було створено");
    }
}
