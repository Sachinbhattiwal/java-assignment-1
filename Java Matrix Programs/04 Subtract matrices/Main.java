import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputObj = new Scanner(System.in);
        System.out.print("Enter the number of rows in 1st matrix: ");
        int row1 = inputObj.nextInt();
        System.out.print("Enter the number of colums in 1st matrix: ");
        int colum1 = inputObj.nextInt();

        int[][] matrix1 = new int[row1][colum1];
        System.out.println("Enter values in matrix in 1st matrix: ");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < colum1; j++) {
                System.out.format("(%d,%d): ", i + 1, j + 1);
                matrix1[i][j] = inputObj.nextInt();
            }

        }

        System.out.print("Enter the number of rows in 2nd matrix: ");
        int row2 = inputObj.nextInt();
        System.out.print("Enter the number of colums in 2nd matrix: ");
        int colum2 = inputObj.nextInt();

        if (row1 != row2 || colum1 != colum2) {
            System.out.println("Incompatible for subtraction");
            inputObj.close();
            return;
        }

        int[][] matrix2 = new int[row2][colum2];
        System.out.println("Enter values in matrix in 2nd matrix");
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < colum2; j++) {
                System.out.format("(%d,%d): ", i + 1, j + 1);
                matrix2[i][j] = inputObj.nextInt();
            }

        }
       
        
        int[][] matrix3 = new int[row2][colum2];
        
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < colum1; j++) {
                matrix3[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }

        System.out.println("Difference of 2 matrix: ");        
        for (int i = 0; i < row1; ++i) {
            System.out.println(Arrays.toString(matrix3[i]));
        }

        inputObj.close();
    }
}
