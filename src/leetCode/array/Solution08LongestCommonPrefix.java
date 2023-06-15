package leetCode.array;

import java.util.Arrays;

public class Solution08LongestCommonPrefix {

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight","flowest"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);

        int index = 0;
        String first = strs[0];
        String last = strs[strs.length - 1];

        while (index < strs.length) {
            if (first.charAt(index) == last.charAt(index)) {
                index++;
            } else {
                break;
            }
        }
        return index == 0 ? "" : first.substring(0, index);
    }
}
