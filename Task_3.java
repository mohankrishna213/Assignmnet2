import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task_3 {
    public static void main(String[] args) {
        // Create a List and add some elements to it
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(5);
        numbers.add(30);
        numbers.add(15);

        // Find the minimum and maximum elements in the List
        int minElement = Collections.min(numbers);
        int maxElement = Collections.max(numbers);

        // Print the minimum and maximum elements
        System.out.println("The minimum element in the List is: " + minElement);
        System.out.println("The maximum element in the List is: " + maxElement);
    }
}
