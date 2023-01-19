public class Main {
    public static void main(String[] args) {
        int[] numbers = {550,-5,10, 33, 29, 11, 37, 2, 11,37,-7,600, 36, 25, 9, 16, 7, 29, 19, 23, 26, 21, 6, 34,54,-1};
        int[] sortedArray = insertionSort(numbers);
        displayArray(sortedArray);
    }

    public static int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; ++i) {
            int j = i;
            int key = array[i];
            while ( j > 0 && array[j-1]>key ) {
                array[j] = array[j-1];
                --j;
            }
            array[j] = key;
        }
        return array;
    }
    public static void displayArray ( int[] array) {
        System.out.print("{");
        for (int i = 0; i < array.length; ++i) {
            System.out.print(array[i]+", ");
        }
        if (array.length > 1) {
            System.out.print("\b\b}");
        } else {
            System.out.print("}");
        }
    }
}