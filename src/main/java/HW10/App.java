package HW10;

public class App {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        list.add("Lexus");
        list.add("Mercedes");
        list.add("Mazda");
        list.add("Jeep");
        list.add("Toyota");
        list.remove("Toyota");
        System.out.println(list);

        list.set(2, "Lamborghini");

        System.out.println(list);

        System.out.println(list.get(1));

        MyArrayList list2 = new MyArrayList();
        list2.size();
        System.out.println(list2);
    }
}
