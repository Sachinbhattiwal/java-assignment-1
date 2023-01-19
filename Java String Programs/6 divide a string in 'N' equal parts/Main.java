import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String str = "aaaaaabbbbbbcccccc";
        Scanner inputObj = new Scanner(System.in);
        System.out.println("Enter the number of substrings required");
        int n = inputObj.nextInt();
        inputObj.close();
        
        if (str.length()%n != 0 ) {
            System.out.println("String cannot be divided in n equal parts");
            return ;
        }
        String[] substringArray = new String[n] ;

        int sliceSize = str.length()/n;

        int i = 0;
        while (true) {
            int beginIndex = i * sliceSize;
            int endIndex = (i + 1) * sliceSize ;
            substringArray[i] = str.substring( beginIndex, min( endIndex, str.length() ) );
            if ((i+1)*sliceSize+1 > str.length()) {
                break;
            }
            ++i;
        }

        System.out.println(Arrays.toString(substringArray));
    }

    public static int min(int a, int b) {
        if (a<b) {
            return a;
        }
        return b;
    }
}