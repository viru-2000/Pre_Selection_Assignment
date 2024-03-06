/*Write a program to find greatest common divisor (GCD) or highest common factor (HCF) of given two numbers */

import java.util.Scanner;

public class GCDHCFCalculator {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = Math.abs(scanner.nextInt());

        System.out.print("Enter the second number: ");
        int num2 = Math.abs(scanner.nextInt());

        int gcd = findGCD(num1, num2);

        System.out.println("GCD/HCF of " + num1 + " and " + num2 + " is: " + gcd);

        scanner.close();
    }

    /**
     * @param a
     * @param b
     * @return
     */
    private static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
