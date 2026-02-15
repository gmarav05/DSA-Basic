import java.util.Arrays;
import java.util.HashSet;

public class Duplicate {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 2, 3, 4, 4, 5};

        HashSet<Integer> original = new HashSet<>(Arrays.asList(numbers));

        System.out.println(original);

    }
    
}
