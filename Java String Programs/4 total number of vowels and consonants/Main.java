public class Main {
    public static void main(String[] args) {
        String myString = "Shake Hands";
        int vowels = 0;
        int consonants  = 0;
        for (int i = 0; i < myString.length(); ++i) {
            if ( isVowel( myString.charAt(i) ) ) {
                vowels++;
            } else if (isConsonant(myString.charAt(i))) {
                ++consonants;
            }
        }
        System.out.println("Number of vowlels in string: "+vowels);
        System.out.println("Number of consontants in string: "+ consonants);
    }
    
    public static boolean isVowel(char ch) {
        String vowels = "aeiouAEIOU";
        if (vowels.indexOf(ch) >= 0) {
            return true;
        }
        return false;
    }

    public static boolean isConsonant(char ch) {
        String consonants = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
        if (consonants.indexOf(ch) >= 0) {
            return true;
        }
        return false;
    }
}