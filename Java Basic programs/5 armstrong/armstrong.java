import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        int number;
        int sumOfCubes = 0;
        int tempnum;

        Scanner inputObj =  new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = inputObj.nextInt();
        tempnum = number;
        while (tempnum > 0) {
            sumOfCubes += power((tempnum%10), 3);
            tempnum /= 10;
        }
        if ( sumOfCubes == number) {
            System.out.println("Entered number is a armstrong number");
        } else {
            System.out.println("Entered number is not a palindrome number");
        }
        inputObj.close();
    }
    
    static int power(int b, int e) {
        int result = 1;
        for (int i = 0; i < e; ++i) {
            result = result * b;
        }
        return result;
    }
}
