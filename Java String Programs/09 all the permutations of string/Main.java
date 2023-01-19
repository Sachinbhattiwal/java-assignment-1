class Main {
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; ++i) {
            result *= i;
        }
        return result;
    }
    public static String swap(String st, int x, int y) {
        char temp = st.charAt(x);
        char[] stArray = st.toCharArray();
        stArray[x] = st.charAt(y);
        stArray[y] = temp;
        return new String(stArray);
    }
    public static void permutation( String str, int index) {
        if (index == str.length()-1) {
            System.out.println(str);
            return ;
        }
        for (int i = index; i < str.length();++i) {
            permutation(swap(str, index, i), index+1);
        }
    }
    public static void main(String[] args) {
        String str = "JAVA";
        permutation(str, 0);
        
    }
}