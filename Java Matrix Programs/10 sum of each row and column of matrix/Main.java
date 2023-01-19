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

        System.out.println();        
        for (int i = 0; i < m; ++i) {
            int sum = 0;
            System.out.print("Sum of row "+(i+1)+" : ");
            for( int j = 0; j < n; ++j) {
                sum += matrix[i][j];
            }
            System.out.println(sum);
        }

        System.out.println();
        for (int i = 0; i < n; ++i) {
            int sum = 0;
            System.out.print("Sum of column "+(i+1)+" : ");
            for( int j = 0; j < m; ++j) {
                sum += matrix[j][i];
            }
            System.out.println(sum);
        }
        inputObj.close();
    }
}