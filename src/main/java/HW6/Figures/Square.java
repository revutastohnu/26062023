package HW6.Figures;

import HW6.Figures.Figure;

public class Square implements Figure {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
