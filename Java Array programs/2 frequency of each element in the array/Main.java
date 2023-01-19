import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        int[] numbers = {24, 16, 21, 12, 14, 15, 15, 21, 15, 17, 15, 17, 24, 25, 24, 19, 19, 21, 24, 16};

        HashMap<Integer,Integer> myMap = new HashMap<Integer,Integer>();

        for (int myNumber : numbers) {
            if (isExist(myMap, myNumber)) {
                int currentvalue = myMap.get(myNumber);
                myMap.replace(myNumber, currentvalue, ++currentvalue);
            }
            else {
                myMap.put(myNumber, 1);
            }
        }
        System.out.println("Given below is: `element=frequency`");
        System.out.println(myMap);
    }
    public static boolean isExist(HashMap<Integer, Integer> map, int value) {
        for (int key : map.keySet()) {
            if (value == key) {
                return true;
            }
        }
        return false;
    }
}