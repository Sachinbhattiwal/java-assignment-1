import java.util.Arrays;
import java.util.Scanner;

class Matrix {
    public static void main(String[] args) {
        Scanner inputObj = new Scanner(System.in);
        int n,m;
        System.out.println("Enter the order of matrix: ");
        n = inputObj.nextInt();
        m = inputObj.nextInt();

        int[][] matrix ;
        matrix = new int[n][m];

        System.out.println("Enter the matrix: ");
        for ( int i = 0 ; i < n ; ++i) {
            for (int j = 0 ; j < m ; ++j) {
                System.out.format("(%d,%d): ", i+1, j+1);
                matrix[i][j] = inputObj.nextInt();
            }
        }
        
        System.out.println("Entered matrix is:");
        for (int i = 0 ; i < n; ++i) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        inputObj.close();
    }
}