class Main { 
    public static void main(String[] args) {
        String str = "JaVaJAva";
        char[] charArray = str.toCharArray();
        for (int i = 0; i < str.length(); ++i) {
            Character chr = charArray[i];
            if (Character.isUpperCase(chr)) {
                charArray[i] = Character.toLowerCase(chr);
            } else if (Character.isLowerCase(chr)) {
                charArray[i] = Character.toUpperCase(chr);
            }
        }
        String newString = new String(charArray);
        System.out.println(newString);
    } 
}