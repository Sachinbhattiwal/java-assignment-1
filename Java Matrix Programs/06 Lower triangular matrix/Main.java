import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputObj = new Scanner(System.in);
        System.out.print("Enter the number of rows in  matrix: ");
        int rows = inputObj.nextInt();
        System.out.print("Enter the number of colums in  matrix: ");
        int columns = inputObj.nextInt();

        int[][] matrix = new int[rows][columns];
        System.out.println("Enter values in matrix in  matrix");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.format("(%d,%d): ", i + 1, j + 1);
                matrix[i][j] = inputObj.nextInt();
            }

        }
        System.out.println();

        int[][] lowerMatrix  = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (i < j) {
                    lowerMatrix[i][j] = 0;
                } else {
                    lowerMatrix[i][j] = matrix[i][j];
                }
            }
            System.out.println();
        }

        System.out.println("Lower triangular matrix: ");        
        for (int i = 0; i < rows; ++i) {
            System.out.println(Arrays.toString(lowerMatrix[i]));
        }
        inputObj.close();
    }

}
