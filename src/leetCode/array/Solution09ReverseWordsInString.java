package leetCode.array;

import java.util.Arrays;
import java.util.Collections;

public class Solution09ReverseWordsInString {

    public static void main(String[] args) {
        String s = "a good   example   ";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {

        String[] words = s.split(" +");

        Collections.reverse(Arrays.asList(words));

        return String.join(" ", words).trim();

        /*// Trim leading and trailing spaces
        s = s.trim();

        // Split the string into an array of words
        String[] words = s.split("\\s+");

        // Reverse the order of the words
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i > 0) {
                reversed.append(" ");
            }
        }

        return reversed.toString();*/
    }
}
