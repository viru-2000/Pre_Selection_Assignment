/*6. Write a program to convert Fahrenheit into Celsius. Input the value using scanner.*/


import java.util.*;

public class Assignment6{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in fahrenheit: ");
        int fahrenheit = scanner.nextInt();
        int celsius = ((fahrenheit - 32) * 5 / 9);
        System.out.println("Temperature in Celsius: " + celsius + " °C");
    }
}
