public class copy {
    public static void displayArray(int[] aray) {
        System.out.print("{");
        for ( int num : aray) {
            System.out.print(num + ", ");
        }
        System.out.println("\b}");
    }
    
    public static void main(String[] args) {
        int[] numbers = {1,3,4,5};
        System.out.print("Initial array: ");
        displayArray(numbers);
        int[] newarray = new int[numbers.length];
        for (int i = 0; i < numbers.length; ++i) {
            newarray[i] = numbers[i];
        }
        System.out.print("New array: ");
        displayArray(newarray);
    }
}