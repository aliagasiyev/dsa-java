package dsa.java.sorting.bubblesort;

import java.util.Arrays;

public class BubbleSorting1 {
    public static void main(String[] args) {

        int[] myArray = {5,4,3,2,1};
        System.out.println(Arrays.toString(myArray));

        sortMyArray(myArray);
        System.out.println(Arrays.toString(myArray));
    }

    public static void sortMyArray(int[] array) {
        boolean swapped = false;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
}
