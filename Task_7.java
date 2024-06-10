import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Task_7 {
    public static void main(String[] args) {
        // Create a List of integers
        List<Integer> numbers = Arrays.asList(10, 20, 5, 30, 15);

        // Find the minimum value using streams
        Optional<Integer> minValue = numbers.stream()
                                            .min(Integer::compareTo);

        // Find the maximum value using streams
        Optional<Integer> maxValue = numbers.stream()
                                            .max(Integer::compareTo);

        // Print the results
        if (minValue.isPresent()) {
            System.out.println("The minimum value in the list is: " + minValue.get());
        } else {
            System.out.println("The list is empty, no minimum value.");
        }

        if (maxValue.isPresent()) {
            System.out.println("The maximum value in the list is: " + maxValue.get());
        } else {
            System.out.println("The list is empty, no maximum value.");
        }
    }
}
