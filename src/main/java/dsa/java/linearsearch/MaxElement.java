package dsa.java.linearsearch;

public class MaxElement {
    public static void main(String[] args) {
        int[] myArray = {5, 1, 6, 9, 32, 14, -33, 21, 0, -4, 3};
        System.out.println(findMax(myArray));

    }

    public static int findMax(int[] myArray) {
        int max = myArray[0];
        for (int i = 1; i < myArray.length; i++) {
            if (max < myArray[i]) {
                max = myArray[i];
            }
        }
        return max;
    }
}
