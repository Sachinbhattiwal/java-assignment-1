public class Main {
    public static void main(String[] args) {
        int[] numbers = {-15,10, 33, 29, 11, 37, 2, 11,-20,200, 37, 36, 25, 9, 16, 7, 29, 19, 23, 26, 21, 6, 34,-1,-1,100};
        int[] sortedArray = selectionSort(numbers);
        displayArray(sortedArray);
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

    public static int[] selectionSort(int[] array) {
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