import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        int first = 0;
        int next = 1;
        int temp;

        Scanner myobj = new Scanner(System.in);
        System.out.print("Enter a interger: ");
        int n = myobj.nextInt();
        
        System.out.println("Fibonacci seris of "+n+" numbers:");
        for (int i = 0; i < n; ++i) {
            System.out.print(first+", ");
            temp = first;
            first = next;
            next = temp + first;
        }
        myobj.close();
    }
}