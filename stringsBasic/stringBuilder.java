package stringsBasic;

public class stringBuilder {
    public static void main(String[] args) {
        String text = "level";
        String rev = new StringBuilder(text).reverse().toString();

        if (text.equalsIgnoreCase(rev)) {
            System.out.println(rev + " word is a palindrome.");
        } else {
            System.out.println(rev + " word is not a palindrome.");
        }
    }
}
