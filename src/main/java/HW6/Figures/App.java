package HW6.Figures;

import HW6.Figures.Figure;

public class App {
    public static void main(String[] args) {
        Figure[] figures = new Figure[3];
        figures[0] = new Circle(5);
        figures[1] = new Triangle(4, 3);
        figures[2] = new Square(6);

        double totalArea = 0;
        for (Figure figure : figures) {
            totalArea += figure.getArea();
        }
        System.out.println("Total area is " + totalArea + " squared metres");
    }
}
