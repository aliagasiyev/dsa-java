package dsa.java.arrays;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};

        swap(array,1,2);
        System.out.println(Arrays.toString(array));
    }

    public static void swap(int[] array,int a,int b){
        int temp=array[a];
        array[a]=array[b];
        array[b]=temp;

    }
}
