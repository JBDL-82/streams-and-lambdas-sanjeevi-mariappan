import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {
    public static void main(String[] args) {
          List<String> fruits = List.of("apple", "banana", "orange", "apple", "grape", "banana", "pear", "peach", "mango", "kiwi",
            "strawberry", "blueberry", "apple", "banana", "cherry", "grape", "mango", "peach", "orange", "kiwi",
            "papaya", "pineapple", "pear", "plum", "banana", "apple", "cherry", "fig", "grape", "orange",
            "watermelon", "peach", "mango", "strawberry", "blackberry", "raspberry", "blueberry", "plum", "apple", "banana",
            "coconut", "apricot", "grapefruit", "lemon", "lime", "pomegranate", "apple", "banana", "orange", "kiwi");

            System.out.println(fruits.stream().collect(Collectors.toSet()).stream().collect(Collectors.joining(",")));
    }
}
