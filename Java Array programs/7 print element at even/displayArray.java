public class displayArray {
    public static void main(String[] args) {
        int[] numbers = {10,20,30,35,40};
        System.out.print("{");
        for( int i = 1; i < numbers.length; i = i+2) {
            System.out.print(numbers[i]+", ");
        }
        System.out.print("}");
    }
}