public class displayReverseArray {
    public static void main(String[] args) {
        int[] numbers = {10,15,20,25,30};
        System.out.print("{");
        for( int i = numbers.length - 1; i>=0; --i) {
            System.out.print(numbers[i]+", ");
        }
        System.out.print("}");
    }
}