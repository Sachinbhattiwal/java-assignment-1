import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        String str1 = "abbbba";
        String str2 = "bbbbaa";

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        
        if (Arrays.equals(charArray1,charArray2)) {
            System.out.println("Given two strings are anagram of each other.");
        } else {
            System.out.println("These two are strings are not anagram of each other.");
        }
    }
}