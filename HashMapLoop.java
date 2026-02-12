
import  java.util.HashMap;

public class HashMapLoop {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        capitalCities.put("Amaravati", "Andhra Pradesh");
        capitalCities.put("Mumbai", "Maharashtra");

        for (String i : capitalCities.keySet()) {
            System.out.println( i + ", " + capitalCities.get(i));
        }

    }
}
