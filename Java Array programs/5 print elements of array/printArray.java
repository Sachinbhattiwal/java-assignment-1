public class printArray {
    public  static void displayArray ( int[] aray) {
        System.out.print("{");
        for (int i = 0; i < aray.length; ++i) {
            System.out.print(aray[i]+", ");
        }
        System.out.print("}");
    }
    
    public static void main(String[] args) {
        int[] numbers = {1,3,5,11,51};
        displayArray(numbers);
    }
}