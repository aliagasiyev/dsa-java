package dsa.java.lesson.loops;

import java.util.Scanner;

public class CountNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        int sum=0;
        while (number != 0) {
            int last_number = number % 10;
            sum = sum + last_number;
            number=number/10;
        }
        System.out.println(sum);

    }
}
