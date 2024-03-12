import java.util.Scanner;

public class NoPrimeNumbersArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        int[][] noPrimeArray = createNoPrimeArray(rows, cols);

        System.out.println("2D Array with No Prime Numbers:");
        printArray(noPrimeArray);

        scanner.close();
    }

    private static int[][] createNoPrimeArray(int rows, int cols) {
        int[][] array = new int[rows][cols];
        int num = 1;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                while (isPrime(num)) {
                    num++;
                }
                array[i][j] = num++;
            }
        }
        return array;
    }

    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
