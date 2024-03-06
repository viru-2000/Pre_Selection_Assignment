/* Take values of length and breadth of a rectangle from user and check if it is square or not. */

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = scanner.nextDouble();

        if (length == breadth) {
            System.out.println("It is a square.");
        } else {
            System.out.println("It is a rectangle.");
        }

        scanner.close();
    }
}