package dsa.java.arrays;
public class Lesson01 {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5};

        for (int num : nums) {
            if (num % 2 == 0) {
                System.out.print(num+" ");
            }
        }
    }
}