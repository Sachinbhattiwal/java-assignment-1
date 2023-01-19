import java.util.Scanner;

public class prime {
    public static void main(String args[]) {
        int number;
        boolean isprime = true;
        Scanner inputObj = new Scanner(System.in);

        System.out.print("Enter a numbe: ");
        number = inputObj.nextInt();

        for(int i=2; i < number; ++i) {
            if (number % i == 0) {
                isprime = false;
            }
        }

        if (isprime) {
            System.out.println("Entered number is prime number");
        } else {
            System.out.println("Enter number is not a prime number");
        }

        inputObj.close();
    }
}