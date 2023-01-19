class Main {
    public static boolean contains(String[] array, String string) {
        for (int i=0 ; i < array.length; ++i) {
            if (string.equals(array[i])) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "acbdfghybdf";
        int strLen = str.length();
        String[] strArray = new String[strLen*(strLen+1)/2];
        int count = 0;
        String longestRepeating = str.substring(0,1);
        for (int i = 0; i < strLen; ++i) {
            for (int j = i; j < strLen; ++j) {
                String temp = str.substring(i,j+1);
                if (contains(strArray,temp)) {
                    if (longestRepeating.length()<temp.length()) {
                        longestRepeating = temp;
                    }
                }
                strArray[count] = temp;
                ++count;
            }
        }
        System.out.println("Longest repeating sequence is: "+longestRepeating);
    }
}