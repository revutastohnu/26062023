package HW9;
import java.util.List;
import java.util.ArrayList;
class Box<T extends Fruit> {
    private List<T> box = new ArrayList<>();
    private final int MAX_BOX_SIZE = 10;

    public void addFruit(T fruit) {
            if (fruit == null) {
                throw new NullPointerException("The passed value cannot be null");
            }
            if (box.size() >= MAX_BOX_SIZE) {
                throw new IllegalArgumentException("The box is full");
            }

            box.add(fruit);
    }


    public void addFruit(List<T> fruits) {
            if (fruits == null) {
                throw new NullPointerException("The passed value cannot be null");
            }

            if (fruits.size() + box.size() > MAX_BOX_SIZE) {
                throw new IllegalArgumentException("The box is full");
            }

            box.addAll(fruits);
    }

        public float getWeight()
        {
        float totalWeight = 0.0f;
        for (T fruit : box) {
            totalWeight += fruit.getFruitWeight();
        }
        return totalWeight;
        }

    public boolean compare(Box<?> otherBox) {
        if (otherBox == null){
            throw new NullPointerException("You're trying to compare with null");
        }


        return Math.abs(this.getWeight() - otherBox.getWeight()) < 0.0001;
    }
    public void merge(Box<T> otherBox) {
        if (this == otherBox) {
            throw new IllegalArgumentException("You're trying to merge a box with itself");
        }

        int totalFruitsCount = box.size() + otherBox.box.size();
        if (totalFruitsCount > MAX_BOX_SIZE) {
            throw new IllegalArgumentException("You cannot merge, the box will be over its max size");
        }

        box.addAll(otherBox.box);
        otherBox.box.clear();
    }

    }
