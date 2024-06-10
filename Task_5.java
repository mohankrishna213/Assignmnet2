import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task_5 {
    public static void main(String[] args) {
        // Create a List of strings
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date");

        // Convert the list of strings to uppercase using streams
        List<String> uppercaseStrings = strings.stream()
                                               .map(String::toUpperCase)
                                               .collect(Collectors.toList());

        // Print the list of uppercase strings
        System.out.println("Uppercase strings: " + uppercaseStrings);
    }
}
