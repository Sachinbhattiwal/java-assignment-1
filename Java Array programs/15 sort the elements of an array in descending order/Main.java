public class Main {
    public static void main(String[] args) {
        int[] arrey = {9607,4024, 6599, 4680, 9366, 6798, 8499,-55, 8996, 8419, 8041, 5786, 3141, 9607,0};
        printArray(sort(arrey));
    }
    public static int[] sort(int[] array) {
        for(int i = 0; i < array.length; ++i) {
            int indexOfLargest = i;
            for (int j = i; j < array.length; ++j) {
                if (array[indexOfLargest] < array[j]) {
                    indexOfLargest = j;
                }
            }
            int temp = array[i];
            array[i] = array[indexOfLargest];
            array[indexOfLargest] = temp;
        }
        return array;
    }
    public static void printArray(int[] array) {
        for (int num: array) {
            System.out.print(num + ", ");
        }
    }
}