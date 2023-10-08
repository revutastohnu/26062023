package hw18.decorator;

public class BlackTea implements Tea {
    @Override
    public double cost() {
        return 10;
    }

    @Override
    public String description() {
        return "This is just a cup of black tea";
    }
}
