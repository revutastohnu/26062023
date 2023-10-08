package hw18.decorator;

public class TeaDecorator implements Tea {
    protected Tea tea;
    public TeaDecorator(Tea tea) {
        this.tea = tea;
    }
    public double cost() {
        return tea.cost();
    }

    public String description() {
        return tea.description();
    }
}
