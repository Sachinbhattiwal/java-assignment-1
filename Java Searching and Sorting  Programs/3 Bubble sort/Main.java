public class Main {
    public static void main(String[] args) {
        int[] numbers = {102, 10, 33, 29, 11, 37, 2, 11,1000,-100, 37, 36, 25, 9, 16, 7, 29, 19, 23, 26, 21, 6, 34, -5};

        int[] sortedArray = bubbleSort(numbers);
        displayArray(sortedArray);
    }

    public static int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length-1; ++i) {
            for (int j = 0; j < array.length-1; ++j) {
                if (array[j] > array[j+1]) {
                    int a = array[j];
                    array[j] = array[j+1];
                    array[j+1] = a;
                }
            }
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