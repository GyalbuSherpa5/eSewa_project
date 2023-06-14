package practiceQuestion;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Repeat {
    public static void main(String[] args) {
        Repeat r = new Repeat();
        int arr2[] = {1, 1, 2, 3, 5, 5, 4, 2, 3, 4, 34};
        int value = r.getSingNum(arr2);
        System.out.println("non repeated value is " + value);

    }

    public int getSingNum(int[] arr2) {

        Map<Integer,Integer> map = new HashMap<>();
        for (int num : arr2) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry entry: map.entrySet()) {
            int value = (int) entry.getValue();
            if(value == 1){
                System.out.println(entry.getKey());
            }
        }

        int temp = -1;
        for (int i = 0; i < arr2.length; i++) {
            Integer num = arr2[i];
            temp = -1;
            for (int j = 0; j < arr2.length; j++) {
                if (i == j) {
                    continue;
                }
                if (num.equals(arr2[j])) {
                    temp = -1;
                    break;
                } else {
                    temp = arr2[i];
                }
            }
            if (temp != -1) {
                break;
            }
        }
        return temp;
    }
}
