package num;

public class averagArray {
    public static void main(String[] args) {
        int myArray[] = {20, 22, 18, 35, 48, 26, 87, 70};
        float sum = 0;
        
        for (int i = 0; i < myArray.length; i++) {
            sum += myArray[i];
        }

        float avg = sum / myArray.length;
        System.out.println(avg);


    }
}
