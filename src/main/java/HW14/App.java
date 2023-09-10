package HW14;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(Product.Type.BOOK, 300, true));
        products.add(new Product(Product.Type.BOOK, 100, false));
        products.add(new Product(Product.Type.BACKPACK, 50, true));
        products.add(new Product(Product.Type.TOY, 200, false));

        List<Product> booksOver250 = UtilMethods.filterBooksOver250(products);

        List<Product> discountedBooks = UtilMethods.filterDiscountedBooks(products);

        Product cheapestBook = UtilMethods.findCheapestBook(products);

        List<Product> lastThreeAdded = UtilMethods.findLastThreeAddedProducts(products);

        double totalCost = UtilMethods.calculateTotalCost(products);

        Map<Product.Type, List<Product>> groupedByType = UtilMethods.groupByType(products);

        UtilMethods.groupByTypeAndPrint(products);


    }
}
