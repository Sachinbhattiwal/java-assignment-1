import java.util.Arrays;

class Subset {
    public static void main(String[] args) {
        String str = "FUN";
        int strLen = str.length();
        String[] strArray = new String[strLen*(strLen+1)/2];
        int count = 0;
        for (int i = 0; i < strLen; ++i) {
            for (int j = i; j < strLen; ++j) {
                strArray[count] = str.substring(i, j+1);
                count++;
            }
        }
        System.out.println(Arrays.toString(strArray));
    }
}