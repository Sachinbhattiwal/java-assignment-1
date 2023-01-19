import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int[][] matrix ;
        int zeros = 0;
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

        for(int i = 0; i < m; ++i) {
            for(int j =0; j < n; ++j) {
                if (matrix[i][j] == 0 ) {
                    zeros++;
                }
            }
        }
        
        if (zeros >= m * n) {
            System.out.println("It is sparse matrix");
        } else {
            System.out.println("Not a sparse matrix");
        }
        inputObj.close();
    }
}