package HW15;

public abstract class Animal {
    private String name;
    private String species;
    private int numberOfLegs;

    public Animal(String name, String species, int numberOfLegs) {
        this.name = name;
        this.species = species;
        this.numberOfLegs = numberOfLegs;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    @Override
    public String toString() {
        return name + " {"+
                "species= '" + species + '\'' +
                ", numberOfLegs= " + numberOfLegs +
                '}';
    }
}
