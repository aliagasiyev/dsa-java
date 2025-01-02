package dsa.java.linearsearch;

import java.util.Scanner;

public class Search2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] myArray = {18, 12, -7, 3, 14, 28};
        int target = scanner.nextInt();
        boolean isFound = false;

        for (int i = 1; i < 5; i++) {
            if (target == myArray[i]) {
                System.out.println("Search in specific area number index is:" + i);
                isFound = true;
                break;
            }
        }
        if (!isFound) {
            System.out.println("Your number never find in your array");
        }
    }
}
