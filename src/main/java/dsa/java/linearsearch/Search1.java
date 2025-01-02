package dsa.java.linearsearch;

import java.util.Scanner;

public class Search1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] myArray = {1, 4, 8, 18,43};
        int target = scanner.nextInt();
        boolean found = false;

        for (int i = 0; i < myArray.length; i++) {
            if (target == myArray[i]) {
                System.out.println("Here is your number index:" + i);
                found = true;
                break;

            }
        }
        if (!found) {
            System.out.println("Your number is never found");
        }

    }
}

