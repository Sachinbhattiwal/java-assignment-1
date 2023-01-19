public class IntToChar {
    public static void main(String[] args) {
        // for ascii codes 
        int numer = 99;
        char chr = (char) numer;
        System.out.println(chr);

        //For numeric values
        int num = 7;
        char chrNum = String.valueOf(num).charAt(0);
        System.out.println(chrNum);
    }
}
