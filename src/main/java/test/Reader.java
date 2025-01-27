package test;


public class Reader {
    public static void main(String[] args) {
        int result = divide(2, 0);
        System.out.println(result);
    }

    public static int divide(int a, int b) {
        try {
            int c = a / b;
            return c;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
            return -1;
        } finally {
            System.out.println("Inside finally block");
            return 15;
        }
    }
}