package leetCode.array;

import java.util.ArrayList;

public class Solution07LengthOfLastWord {
    public static void main(String[] args) {
        String s = "luffy is still joyboy";
        System.out.println(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s) {

        String don = s.trim();

        int count = 0;
        for (int i = don.length() - 1; i >= 0; i--) {
            if (don.charAt(i) != ' ') {
                count += 1;
            } else {
                break;
            }
        }
        return count;
    }
}

