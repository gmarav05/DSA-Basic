package stringsBasic;

public class palindromCheck {

    public static void main(String[] args) {
        
        String word = "level";
        String rev = "";
        boolean check;
    
        for(int i =0; i< word.length(); i++) {
            rev = word.charAt(i) + rev;
        }

        if (rev.contentEquals(word)) {
            check = true;
            System.out.println(word +" Word is a palindrome.");
        }

    }

}
