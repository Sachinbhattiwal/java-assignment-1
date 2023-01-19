public class Main {
    public static void main(String[] args) {
        String str = "Hello Java!";
        int punctuations = 0;
        for(int i =0; i < str.length(); ++i) {
            if (!isAlphabet(str.charAt(i)) && str.charAt(i) != ' ') {
                punctuations++;
            }
        }
        System.out.println("Number of punctuations is: "+punctuations);
    }
    

    public static boolean isAlphabet(char ch) {
        String alphabets = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        if (alphabets.indexOf(ch) >= 0) {
            return true;
        }
        return false;
    }
}