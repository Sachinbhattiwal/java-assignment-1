import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        int number;
        long result = 1;
        Scanner inputObj = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = inputObj.nextInt();
        for (int i = 1; i <= number; ++i) {
            result *= i;
        }
        System.out.println("Factorial of "+number+" is "+result);
        inputObj.close();
    }
}
