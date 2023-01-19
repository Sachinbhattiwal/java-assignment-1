public class array {
    public static void main(String[] args) {
        int[] numbers = {100, 200, 300, 400, 1100, 1, 3, 5};
        int sum = 0;
        for (int i = 0; i < numbers.length; ++i) {
            sum += numbers[i]; 
        }
        System.out.println("Sum of all the elements in array is: " + sum);
    }
}