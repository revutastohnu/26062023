package coffee.order;

public class App {
    public static void main(String[] args) {
        CoffeeOrderBoard board = new CoffeeOrderBoard();
        board.add("Alen");
        board.add("Yoda");
        board.add("Obi-van");
        board.add("John Snow");
        board.draw();
        board.deliver();
        board.deliver();
        board.draw();
        board.deliver(3);
        board.draw();
    }
}
