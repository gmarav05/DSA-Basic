package num;

public class smallElement {
    public static void main(String[] args) {
        int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};
        int small;
        small = ages[0];

        if (ages.length == 0) {
            System.out.println("Array is empty");
        }

        for (int age : ages) {
            if(age < small) {
                small = age;
            }
        }

        System.out.println(small);
        
    }
}
