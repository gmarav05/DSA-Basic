package stringsBasic;

public class reverseString {
    public static void main(String[] args) {
        String originalStr = "Hello";
        String rev = "";
        System.out.println("Original String" + originalStr);

        for (int i = 0; i < originalStr.length(); i++) {
            rev = originalStr.charAt(i) + rev;
        }
        System.out.println("Reverse is " + rev);
    }
}
