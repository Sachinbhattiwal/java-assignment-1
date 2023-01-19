class CharToInt {
    public static void main(String[] args) {
        //For character code
        char character = 'e';
        int numchar = character;
        System.out.println(numchar);

        //For numeric values 
        char chrNum = '9';
        int intNum = Integer.valueOf(String.valueOf(chrNum));
        System.out.println(intNum);
    }
}