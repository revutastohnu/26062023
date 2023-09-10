package HW14;
import java.util.*;
import java.util.stream.Collectors;
import java.time.LocalDate;

public class UtilMethods {

        public static List<Product> filterBooksOver250(List<Product> products) {
            return products.stream()
                    .filter(p -> "Book".equals(p.getType()) && p.getPrice() > 250)
                    .collect(Collectors.toList());
        }

        public static List<Product> filterDiscountedBooks(List<Product> products) {
            return products.stream()
                    .filter(p -> "Book".equals(p.getType()) && p.isDiscount())
                    .map(p -> new Product(p.getType(), p.getPrice() * 0.9, p.isDiscount(), p.getCreateDate(), p.getId()))
                    .collect(Collectors.toList());
        }
        public static Product findCheapestBook(List<Product> products) {
            return products.stream()
                    .filter(p -> Product.Type.BOOK.equals(p.getType()))
                    .min(Comparator.comparing(Product::getPrice))
                    .orElseThrow(() -> new NoSuchElementException("A book product not found"));
        }

        public static List<Product> findLastThreeAddedProducts(List<Product> products) {
            return products.stream()
                    .sorted(Comparator.comparing(Product::getCreateDate).reversed())
                    .limit(3)
                    .collect(Collectors.toList());
        }

        public static double calculateTotalCost(List<Product> products) {
            return products.stream()
                    .filter(p -> "Book".equals(p.getType()) && p.getPrice() <= 75 && p.getCreateDate().getYear() == LocalDate.now().getYear())
                    .mapToDouble(Product::getPrice)
                    .sum();
        }

        public static Map<Product.Type, List<Product>> groupByType(List<Product> products) {
            return products.stream()
                    .collect(Collectors.groupingBy(Product::getType));
        }

    public static void groupByTypeAndPrint(List<Product> products) {
        Map<Product.Type, List<Product>> groupedByType = products.stream()
                .collect(Collectors.groupingBy(Product::getType));

        System.out.println("{");
        for (Map.Entry<Product.Type, List<Product>> entry : groupedByType.entrySet()) {
            System.out.println("    \"" + entry.getKey() + "\",");
            System.out.println("    [");
            for (Product product : entry.getValue()) {
                System.out.println("        {");
                System.out.println("            type: \"" + product.getType() + "\",");
                System.out.println("            price: " + product.getPrice() + ",");
                System.out.println("            discount: " + product.isDiscount() + ",");
                System.out.println("            createDate: \"" + product.getCreateDate() + "\"");
                System.out.println("        },");
            }
            System.out.println("    ],");
        }
        System.out.println("}");
    }

}
