package hw18.decorator;

public class MilkTea extends TeaDecorator {

    public MilkTea(Tea tea) {
        super(tea);
    }
    public double cost() {
        return tea.cost() + 5;
    }

    public String description(){
        return tea.description() + " with added milk";
    }
}
