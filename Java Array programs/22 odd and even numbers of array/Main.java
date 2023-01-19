public class Main {
    public static void main(String[] args) {
        int[] arrey = {9607,4024, 6599, 4680, 9366, 6798, 8499,-55, 8996, 8419, 8041, 5786, 3141, 9607,0};

        //Odd numbers
        System.out.print("Odd Numbers: ");
        for (int i = 0; i < arrey.length; ++i) {
            if ( arrey[i] % 2 != 0) {
                System.out.print(arrey[i]+", ");
            }
        }

        //Even numbers
        System.out.print("\n\nEven Numbers: ");
        for (int i = 0; i < arrey.length; ++i) {
            if ( arrey[i] % 2 == 0) {
                System.out.print(arrey[i]+", ");
            }
        }
    }
}