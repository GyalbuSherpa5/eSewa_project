package leetCode.hashMap;

import java.util.HashMap;
import java.util.Map;

/*Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

Each letter in magazine can only be used once in ransomNote.



Example 1:

Input: ransomNote = "a", magazine = "b"
Output: false

Example 2:

Input: ransomNote = "aa", magazine = "ab"
Output: false

Example 3:

Input: ransomNote = "aa", magazine = "aab"
Output: true



Constraints:

    1 <= ransomNote.length, magazine.length <= 105
    ransomNote and magazine consist of lowercase English letters.

*/

public class Solution03RansomNote383 {

    public static void main(String[] args) {
        System.out.println(canConstruct("don", "donkey"));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> maps = new HashMap<>();

        for (int i = 0; i < magazine.length(); i++) {
            maps.put(magazine.charAt(i), maps.getOrDefault(magazine.charAt(i), 0) + 1);
        }

        int count = 0;
        for (int i = 0; i < ransomNote.length(); i++) {
            char ch = ransomNote.charAt(i);

            if (maps.containsKey(ch) && maps.get(ch) > 0) {
                count++;
                maps.put(ch, maps.get(ch) - 1);
            } else {
                break;
            }
            if (count == ransomNote.length()) {
                return true;
            }
        }
        return false;
    }
}
