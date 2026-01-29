package stringsBasic;

public class countDigits {
    public static void main(String[] args) {
        String text = "There are 12 apples and 26 mangos.";
        int count = 0;

        for (char c : text.toCharArray()) {
            if(Character.isDigit(c)) {
                count++;
            }
        }

        System.out.println("numbers " + count);

    }
}
