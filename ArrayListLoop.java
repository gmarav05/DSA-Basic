import java.util.*;

public class ArrayListLoop {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();

        cars.add("Tata");
        cars.add("Mahindra");

        for (String i : cars) {
            System.out.println(i);
        }

    }
}
