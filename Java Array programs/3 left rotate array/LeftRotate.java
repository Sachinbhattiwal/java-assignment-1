class LeftRotate {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        System.out.print("Original array: ");
        System.out.println(java.util.Arrays.toString(array));
        int temp = array[0];
        for (int i = 1; i < array.length; ++i) {
            array[i-1] = array[i];
        }
        array[array.length-1] = temp;
        System.out.print("After left rotating:");
        System.out.println(java.util.Arrays.toString(array));
    }
}