package leetCode.hashMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution01TwoSum150 {

    public static void main(String[] args) {
        int[] nums = {2, 11, 3, 9, 6};
        int target = 9;

        int[] ints = twoSum(nums, target);
        System.out.println(Arrays.toString(ints));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            Integer key = map.get(nums[i]);
            if (key != null) {
                return new int[]{key, i};
            }
            map.put(target - nums[i], i);
        }

        return nums;
    }
}
