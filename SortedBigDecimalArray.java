import java.math.BigDecimal;
import java.util.Arrays;

/**
 * This class demonstrates sorting a BigDecimal array using Java's built-in sorting algorithm.
 * It serves as an example of applying various best practices in Java programming.
 */
public class SortedBigDecimalArray { // Applied best practice: Proper class naming convention (CamelCase)
    public static void main(String[] args) {
        // Define an array of BigDecimal objects representing decimal numbers
        BigDecimal[] numbers = {
            new BigDecimal("1.9999"),
            new BigDecimal("2.789"),
            new BigDecimal("3.54566"),
            new BigDecimal("4.67457457"),
            new BigDecimal("5.42324"),
            new BigDecimal("6.7856")
        };

        // Sort the BigDecimal array using Java's built-in sorting algorithm
        Arrays.sort(numbers); // Applied best practice: Using efficient sorting algorithm provided by Java

        // Print the sorted array elements
        System.out.println("Result of Sorted array: ");
        for (BigDecimal number : numbers) {
            System.out.println(number);
        }
    }
}
