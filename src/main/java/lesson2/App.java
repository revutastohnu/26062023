package lesson2;

public class App {
    public static void main(String[] args) {
        Employee employee = new Employee("Alex Popko", "business analyst", "revutastohnu@gmail.com", "+380637313666", (short) 24);
        System.out.println(employee.toString());
        Car audi = new Car();
        audi.start();
    }
}
