import java.util.Collections;
import java.util.Vector;

public class Task_1 {
    public static void main(String[] args) {
        // Create a Vector and add some elements to it
        Vector<Integer> numbers = new Vector<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(5);
        numbers.add(30);
        numbers.add(15);

        // Find the maximum element in the Vector
        int maxElement = Collections.max(numbers);

        // Print the maximum element
        System.out.println("The maximum element in the Vector is: " + maxElement);
    }
}
