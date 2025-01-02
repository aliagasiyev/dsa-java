package dsa.java.linearsearch;

public class MinElement {
    public static void main(String[] args) {
        int[] myArray = {5, 7, 2, 9, 6, 22, 31, 54, -6, 100, 0, -4};
        System.out.println(findMin(myArray));
    }

    public static int findMin(int[] array) {
        int maxNumber = array[0];
        for (int i = 1; i < array.length; i++) {
            if (maxNumber > array[i]) {
                maxNumber = array[i];
            }
        }
        return maxNumber;
    }
}
