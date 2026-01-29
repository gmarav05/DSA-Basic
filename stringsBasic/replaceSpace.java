package stringsBasic;

public class replaceSpace {
    public static void main(String[] args) {
        String text = " Java ";
        String trimmed = text.replaceAll("\\s", "");
        System.out.println(trimmed);
    }
}