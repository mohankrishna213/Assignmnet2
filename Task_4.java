import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Task_4 {
    public static void main(String[] args) {
        // Create a List of integers
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

        // Calculate the average using streams
        OptionalDouble average = numbers.stream()
                                        .mapToInt(Integer::intValue)
                                        .average();

        // Print the average
        if (average.isPresent()) {
            System.out.println("The average is: " + average.getAsDouble());
        } else {
            System.out.println("The list is empty, no average to calculate.");
        }
    }
}
