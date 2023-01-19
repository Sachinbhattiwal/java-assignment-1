import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        int[] arrey = {9607,4024, 6599, 4680, 9366, 6798, 8499,-55, 8996, 8419, 8041, 5786, 3141, 9607,0};
        int[] without_dublicates = removeDuplicates(arrey);
        System.out.println("Sorted Initial array:");
        printArray(sort(arrey));
        System.out.println("3rd largest elelment in arrey considering duplicates as different numbers:"+
        sort(arrey)[arrey.length - 3]);
        System.out.println("\nSorted Array after removing duplicates:");
        printArray(sort(without_dublicates));
        System.out.println("3rd largest number in array considering duplicates as same number:"+
        sort(without_dublicates)[without_dublicates.length -3]);
    }

    public static int[] removeDuplicates(int[] array) {
        ArrayList<Integer> ArrayLst = new ArrayList<Integer>();
        for(int i = 0; i < array.length; ++i) {
            boolean existAhead = false;
            for (int j = i + 1; j < array.length; ++j) {
                if (array[i] == array[j]) {
                    existAhead = true;
                }
            }
            if ( !existAhead) {
                ArrayLst.add(array[i]);
            }
        }

        int[] newArray = new int[ArrayLst.size()];

        for (int i = 0; i < ArrayLst.size(); ++i) {
            newArray[i] = ArrayLst.get(i);
        }

        return newArray;
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

    public static void printArray(int[] array) {
        for (int num: array) {
            System.out.print(num + ", ");
        }
        System.out.println();
    }
}
