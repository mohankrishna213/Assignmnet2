import java.util.Arrays;
import java.util.List;

public class Task_6 {
    public static void main(String[] args) {
        // Create a List of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Calculate the sum of even numbers using streams
        int sumEven = numbers.stream()
                             .filter(n -> n % 2 == 0)
                             .mapToInt(Integer::intValue)
                             .sum();

        // Calculate the sum of odd numbers using streams
        int sumOdd = numbers.stream()
                            .filter(n -> n % 2 != 0)
                            .mapToInt(Integer::intValue)
                            .sum();

        // Print the results
        System.out.println("The sum of even numbers is: " + sumEven);
        System.out.println("The sum of odd numbers is: " + sumOdd);
    }
}
