package leetCode.array;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

public class Solution03RemoveDuplicatesFromSortedArray26 {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};

        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1;

       // Using stream

       /* int[] distinctNums = Arrays.stream(nums)
                .distinct()
                .toArray();

        System.arraycopy(distinctNums, 0, nums, 0, distinctNums.length);

        return distinctNums.length;*/
    }
}
