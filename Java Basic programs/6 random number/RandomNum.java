import java.util.Random;
import java.util.Scanner;

public class RandomNum {
    public static void main(String args[]) {
        double upperLimit, lowerLimit;
        double randomNum ;

        Scanner inputOjb = new Scanner(System.in);
        System.out.println("Enter lower limit: ");
        lowerLimit = inputOjb.nextDouble();
        System.out.println("Enter upper limit: ");
        upperLimit = inputOjb.nextDouble();

        Random randObj = new Random();
        randomNum = randObj.nextDouble();
        System.out.println("A Randome number:"+ (randomNum*(upperLimit - lowerLimit) + lowerLimit));
        inputOjb.close();
    }
}