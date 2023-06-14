package leetCode;

import java.util.HashMap;
import java.util.Map;

// Moore's Voting Algorithm

/*Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.



Example 1:

Input: nums = [3,2,3]
Output: 3

Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2



Constraints:

    n == nums.length
    1 <= n <= 5 * 104
    -109 <= nums[i] <= 109


Follow-up: Could you solve the problem in linear time and in O(1) space?*/

public class Solution04MajorityElement169 {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        int result = majorityElement(nums);
        System.out.println(result);
    }

    public static int majorityElement(int[] nums) {
//        int count = 0;
//        int candidate = 0;
//
//        for (int num : nums) {
//            if (count == 0) {
//                candidate = num;
//            }
//            if (num == candidate) {
//                count++;
//            } else {
//                count--;
//            }
//        }

//        return candidate;

        Map<Integer, Integer> maps = new HashMap<>();

        for (int num : nums) {
            maps.put(num, maps.getOrDefault(num, 0) + 1);
        }

        int targetSize = nums.length / 2;

        for(Map.Entry<Integer,Integer> entry : maps.entrySet()){
            if(entry.getValue() > targetSize){
                return entry.getKey();
            }
        }
        return 0;
    }
}
