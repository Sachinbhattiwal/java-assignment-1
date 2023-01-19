import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        int[] numbers = {24, 16, 21, 12, 14, 15, 15, 21, 15, 17, 15, 17, 24, 25, 24, 19, 19, 21, 24, 16};
        HashMap<Integer,Integer> frequencyMap = createFrequncyMap(numbers);

        System.out.print("Duplicated elements in array are: ");
        for(int key: frequencyMap.keySet()) {
            if(isDuplicated(frequencyMap, key)) {
                System.out.print(key+ ",");
            }
        }       

    }
    public static boolean existInMap(HashMap<Integer, Integer> map, int value) {
        for (int key : map.keySet()) {
            if (value == key) {
                return true;
            }
        }
        return false;
    }

    public static HashMap<Integer, Integer> createFrequncyMap(int[] array) {
        HashMap<Integer,Integer> myMap = new HashMap<Integer,Integer>();

        for (int num : array) {
            if (existInMap(myMap, num)) {
                int currentvalue = myMap.get(num);
                myMap.replace(num, currentvalue, ++currentvalue);
            }
            else {
                myMap.put(num, 1);
            }
        }
        return myMap;
    }
    public static boolean isDuplicated(HashMap<Integer, Integer> map, int value) {
        if (map.get(value) > 1) {
            return true;
        }
        return false;
    }
}