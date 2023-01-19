import java.util.Arrays;

class Main  {
    public static void main(String[] args) {
        String str1 = "D";
        String str2 = "Devender";

        //For single character
        char chr = str1.charAt(0);
        System.out.println(chr);

        //For multicharacter we create a array of characters
        char[] chrArray = str2.toCharArray();
        System.out.println(Arrays.toString(chrArray));
    }
}