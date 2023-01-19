import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] numbers= {10, 33, 29, 11, 37, 2, 11, 37, 36, 25, 9, 16, 7, 29, 19, 23, 26, 21, 6, 34};

        //Input
        Scanner inputObj = new Scanner(System.in) ;
        System.out.print("Enter a number to search in array: ");
        int toSearch = inputObj.nextInt();

        //Sorting array
        numbers = sort(numbers);
        inputObj.close();

        //Finding and output
        int index = binarySearch(numbers, toSearch);
        if (index >= 0) {
            System.out.println("Found");
        } else {
            System.out.println("Not found:");
        }
    }

    public static int binarySearch(int[] array, int toSearch) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = (low + high)/2;
            int middleElement = array[mid];
            if (middleElement == toSearch) {
                return mid;
            } else if (middleElement > toSearch){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
    
    public static int[] sort(int[] array) {
        for(int i = 0; i < array.length; ++i) {
            int indexOfSmallest = i;
            for (int j = i; j < array.length; ++j) {
                if (array[indexOfSmallest] > array[j]) {
                    indexOfSmallest = j;
                }
            }
            int temp = array[i];
            array[i] = array[indexOfSmallest];
            array[indexOfSmallest] = temp;
        }
        return array;
    }
}