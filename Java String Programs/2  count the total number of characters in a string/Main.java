public class  Main {
    public static void main(String[] args) {
        String myString = "My First-Assignment of Java Programming";
        int count = 0;
        for (int i = 0; i < myString.length(); ++i) {
            count++;
        }
        System.out.println("Numbers of characters: "+count);

        //Or simply
        //System.out.println("Numbers of characters: "+myString.length());
    }
}