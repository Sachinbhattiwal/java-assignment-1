import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner inputObj = new Scanner(System.in);

        System.out.print("Enter the number of lines to display: ");
        int number = inputObj.nextInt();
        for (int i = 1; i <= number; ++i) {
            for ( int j = 0; j < i; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }
        inputObj.close();
    }
}
