class LeftRotate {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        System.out.print("Original array: ");
        System.out.println(java.util.Arrays.toString(array));
        int temp = array[array.length-1];
        for (int i = array.length-1; i > 0; --i) {
            array[i] = array[i-1];
        }
        array[0] = temp;
        System.out.print("After left rotating:");
        System.out.println(java.util.Arrays.toString(array));
    }
}