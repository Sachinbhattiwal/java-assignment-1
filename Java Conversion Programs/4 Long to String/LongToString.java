class LongToString {
    public static void main(String[] args) {
        long longNum = 1234567901234567891L;
        String str = String.valueOf(longNum);
        System.out.println(str);
        System.out.println(str instanceof String);
        
    }
}