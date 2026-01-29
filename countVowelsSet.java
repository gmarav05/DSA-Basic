import java.util.HashSet;
import java.util.Set;

public class countVowelsSet {
    public static void main(String[] args) {
        String text = "Hello Java";
        int count = 0;
        Set<Character> vowels = new HashSet<>();

        for (char c : new char[]{'a','e','i','o','u'}) {
            vowels.add(c);
        }

        for(char a : text.toLowerCase().toCharArray()) {
            if (vowels.contains(a)){
                count++;
            }
        } 

        System.out.println("Vowels: " + count);
    }
}
