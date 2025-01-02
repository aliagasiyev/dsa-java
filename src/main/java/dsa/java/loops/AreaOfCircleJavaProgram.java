package dsa.java.loops;

import java.util.Scanner;

public class AreaOfCircleJavaProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        double area = (radius * radius) + Math.PI;
        System.out.println("The area of the circle is " + area);






    }
}
