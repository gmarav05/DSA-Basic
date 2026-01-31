package num;

public  class  largestElement {
    public static void main(String[] args) {
        int nums[] = {12, 7, 25, 3, 18};
        int largestNum = nums[0];

        for(int num : nums) {
            if (num > largestNum) {
                largestNum = num;
            }
        }

        System.out.println("Largest element: " + largestNum);
    }
}