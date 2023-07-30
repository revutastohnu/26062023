package HW9;
import java.util.List;
import java.util.ArrayList;
public class App {
        public static void main(String[] args) {

            Box<Apple> appleBox = new Box<>();
            appleBox.addFruit(new Apple());
            appleBox.addFruit(new Apple());
            appleBox.addFruit(new Apple());

            List<Apple> apples = new ArrayList<>();
            apples.add(new Apple());
            apples.add(new Apple());
            apples.add(new Apple());
            apples.add(new Apple());
            apples.add(new Apple());
            apples.add(new Apple());
            apples.add(new Apple());


            appleBox.addFruit(apples);

            Box<Orange> orangeBox = new Box<>();
            orangeBox.addFruit(new Orange());
            orangeBox.addFruit(new Orange());
            orangeBox.addFruit(new Orange());
            orangeBox.addFruit(new Orange());

            System.out.println("Apple Box weight: " + appleBox.getWeight());
            System.out.println("Orange Box weight: " + orangeBox.getWeight());

            System.out.println(("Do the boxes have the same weight? The result is: " + appleBox.compare(orangeBox)));
        }
}
