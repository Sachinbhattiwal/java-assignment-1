public class smallest {
    public static void main(String[] args) {
        int[] numbers = {100, 200, 300, 400, 1100,1, 3, 5};
        int smallestNum = numbers[0];
        for(int i = 1; i < numbers.length; ++i) {
            if (numbers[i] < smallestNum) {
                smallestNum = numbers[i];
            }
        }
        System.out.println("Largest element in array is: "+smallestNum);
    }
}