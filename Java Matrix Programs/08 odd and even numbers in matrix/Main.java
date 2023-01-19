import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int[][] matrix ;
        int even = 0, odd = 0;
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

        for (int i = 0; i < m; ++i) {
            for (int j=0; j < n; ++j) {
                if (matrix[i][j] % 2 == 0) {
                    ++even;
                } else {
                    ++odd;
                }
            }
        }

        System.out.println("Number of even number is: " + even);
        System.out.println("Number of odd numbers is: " + odd);
        
        inputObj.close();
    }
}