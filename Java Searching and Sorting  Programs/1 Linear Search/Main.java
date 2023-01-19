import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] numbers = {10, 33, 29, 11, 37, 2, 11, 37, 36, 25, 9, 16, 7, 29, 19, 23, 26, 21, 6, 34};

        Scanner inputObj = new Scanner(System.in) ;
        System.out.print("Enter a number to search in array: ");
        int toSearch = inputObj.nextInt();

        int index = linearSearch(numbers, toSearch);
        if (index >= 0) {
            System.out.println("Found at index: "+index);
        } else {
            System.out.println("Not found");
        }
        inputObj.close();
    }

    public static int linearSearch(int[] array, int toSearch) {
        for (int i = 0; i < array.length; ++i) {
            if ( array[i] == toSearch) {
                return i; 
            }
        }
        return -1;
    }
}