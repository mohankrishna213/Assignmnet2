import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Task_2 {
    public static void main(String[] args) {
        // Create an array
        String[] array = {"apple", "banana", "cherry", "date"};

        // Convert the array to a Collection
        Collection<String> collection = new ArrayList<>(Arrays.asList(array));

        // Print the Collection
        System.out.println("The collection is: " + collection);
    }
}
