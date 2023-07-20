package HW6.Figures;

import HW6.Figures.Figure;

public class Circle implements Figure {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
