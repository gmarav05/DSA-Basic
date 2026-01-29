package stringsBasic;

public  class removeVowels {
    public static void main(String[] args) {
        String text = "Hello Java";

        String result = text.replaceAll("[aeiouAEIOU]", "");
        System.out.println(result);
    }
}
