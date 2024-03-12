import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class NoDuplicateValuesArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        int[][] noDuplicateArray = createNoDuplicateArray(rows, cols);

        System.out.println("2D Array with No Duplicate Values:");
        printArray(noDuplicateArray);

        scanner.close();
    }

    private static int[][] createNoDuplicateArray(int rows, int cols) {
        int[][] array = new int[rows][cols];
        Set<Integer> usedValues = new HashSet<>();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int num;
                do {
                    num = (int) (Math.random() * 100); 
                } while (usedValues.contains(num));
                array[i][j] = num;
                usedValues.add(num);
            }
        }
        return array;
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
