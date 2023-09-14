package HW15;

import java.util.*;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        List<Animal> wildAnimals = Arrays.asList(new WildAnimal("Lion", "Feline", 4), new WildAnimal("Elephant", "Elephantidae", 4));
        List<Animal> pets = Arrays.asList(new Pet("Dog", "Canine", 4), new Pet("Cat", "Feline", 4));


        List<Animal> allAnimals = new ArrayList<>();
        allAnimals.addAll(wildAnimals);
        allAnimals.addAll(pets);


        Animal animalWithMostLegs = UtilMethods.findAnimalWithMostLegs(allAnimals);
        System.out.println("Animal with the most legs: " + animalWithMostLegs.getName());


        int totalNumberOfLegs = UtilMethods.getTotalNumberOfLegs(allAnimals);
        System.out.println("Total number of legs: " + totalNumberOfLegs);

        Map<Integer, List<Animal>> animalsGroupedByLegs = UtilMethods.groupAnimalsByLegs(allAnimals);
        System.out.println("Animals grouped by number of legs: " + animalsGroupedByLegs);


        Map<String, Long> animalCountBySpecies = UtilMethods.countAnimalsBySpecies(allAnimals);
        System.out.println("Number of animals by species: " + animalCountBySpecies);

        long numberOfSpecies = UtilMethods.countNumberOfSpecies(allAnimals);
        System.out.println("Total number of species: " + numberOfSpecies);
    }
}
