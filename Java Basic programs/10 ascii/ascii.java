public class ascii {
    public static void main(String[] args) {
        int charint;
        char ch;
        for (int i = 0; i < 16; i++) {
            for ( int j = 0; j < 8; j++) {
                charint = i * 8 + j;
                ch = (char) charint;
                System.out.print(charint + ": ");
                System.out.print("'"+ch+"'");
                System.out.print("      ");
            }
            System.out.println();
        }
    }
}
