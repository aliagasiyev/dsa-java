package dsa.java.lesson.loops;

import java.util.Scanner;

public class NumberReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        while (number > 0) {
            int numberReversed = number % 10;
            number /= 10;
            System.out.print(numberReversed + " ");
        }

    }
}
