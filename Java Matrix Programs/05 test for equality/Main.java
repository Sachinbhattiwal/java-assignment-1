import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean isEqual = true;
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

        if (colum1 != colum2 || row1 != row2) {
            System.out.println("Not equal! . No requirement even for entering 2nd matrix.");
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
        
        outer:
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < colum2; j++) {
                if (matrix1[i][j] != matrix2[i][j]) {
                    isEqual = false;
                    break outer;
                }
            }
        }
        
        if (isEqual) {
            System.out.println("Entered matrices are equal");
        } else {
            System.out.println("Two matrices are not equal");
        }

        inputObj.close();
    }
}
