package HW15;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class UtilMethods {

    public static Animal findAnimalWithMostLegs(List<Animal> animals) {
        return animals.stream()
                .max(Comparator.comparingInt(Animal::getNumberOfLegs))
                .orElse(null);
    }

    public static int getTotalNumberOfLegs(List<Animal> animals) {
        return animals.stream()
                .mapToInt(Animal::getNumberOfLegs)
                .sum();
    }

    public static Map<Integer, List<Animal>> groupAnimalsByLegs(List<Animal> animals) {
        return animals.stream()
                .collect(Collectors.groupingBy(Animal::getNumberOfLegs));
    }

    public static Map<String, Long> countAnimalsBySpecies(List<Animal> animals) {
        return animals.stream()
                .collect(Collectors.groupingBy(Animal::getSpecies, Collectors.counting()));
    }

    public static long countNumberOfSpecies(List<Animal> animals) {
        return animals.stream()
                .map(Animal::getSpecies)
                .distinct()
                .count();
    }


}
