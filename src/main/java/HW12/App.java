package HW12;

import HW12.Methods.Methods;
import HW12.phoneBook.Phonebook;
import HW12.phoneBook.Record;

import java.util.Arrays;
import java.util.List;


public class App {
    public static void main(String[] args) {
        // Контактна книга
        Phonebook phonebook = new Phonebook();
        phonebook.add(new Record("Sanya", "+44182381000"));
        phonebook.add(new Record("Jane", "+380123191238"));
        phonebook.add(new Record("Sanya", "+390127318888"));

        List<Record> allRecords = phonebook.findAll();
        if (allRecords != null) {
            for (Record record : allRecords) {
                System.out.println("Name: " + record.getName() + ", Phone: " + record.getPhone());
            }
        } else {
            System.out.println("The book is empty");
        }

        // Перша частина з методами

        List<Integer> list1 = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        List<Integer> uniqueList = Methods.findUnique(list1);
        System.out.println("Test findUnique: " + uniqueList.equals(Arrays.asList(1, 2, 3, 4, 5)));


        List<String> list2 = Arrays.asList("apple", "banana", "apple", "orange");
        int count = Methods.countOccurance(list2, "apple");
        System.out.println("Test countOccurance: " + (count == 2));


        String[] array = {"apple", "banana", "orange"};
        List<String> list3 = Methods.toList(array);
        System.out.println("Test toList: " + list3.equals(Arrays.asList("apple", "banana", "orange")));


        System.out.println("Test calcOccurance:");
        Methods.calcOccurance(list2);
    }
}
