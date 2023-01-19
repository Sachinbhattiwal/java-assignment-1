import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int[][] matrix ;
        Scanner inputObj = new Scanner(System.in);
        System.out.print("Enter the order (m x n) of matrix: ");
        int m = inputObj.nextInt();
        int n = inputObj.nextInt();
        matrix = new int[m][n];

        System.out.println("Enter elements of matrix: ");
        for (int i = 0; i < m; ++i) {
            for (int j=0; j < n; ++j) {
                System.out.format("(%d,%d): ", i + 1, j + 1);
                matrix[i][j] = inputObj.nextInt();
            }
        }

        int[][] transpose = new int[m][n];
        for (int i = 0; i < m; ++i) {
            for (int j=0; j < n; ++j) {
                transpose[i][j] = matrix[j][i];
            }
        }

        System.out.println("Transpose of entered matrix is :");
        for (int i = 0 ; i < matrix.length; ++i) {
            System.out.println(Arrays.toString(transpose[i]));
        }
        
        inputObj.close();
    }
}