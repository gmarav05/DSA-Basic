package stringsBasic;

import java.util.HashMap;

public class countFreq {
    public static void main(String[] args) {
        String fruit = "apple";
        HashMap<Character, Integer> freq = new HashMap<>();

        for(char c : fruit.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        System.out.println(freq);
    }
}
