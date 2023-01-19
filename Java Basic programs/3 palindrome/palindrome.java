import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        int number;
        int tempnum;
        int reversenum = 0;
        Scanner inputObj = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = inputObj.nextInt();
        tempnum = number;

        while (tempnum > 0) {
            reversenum = (reversenum * 10) + (tempnum%10);
            tempnum = tempnum/10;
        }

        if ( reversenum == number ) {
            System.out.println("Entered number is a palindrome");
        } else {
            System.out.println("Entered number is not a palindrome");
        }
        inputObj.close();
    }
}