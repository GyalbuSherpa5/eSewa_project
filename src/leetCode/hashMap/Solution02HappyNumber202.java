package leetCode.hashMap;

import java.util.HashSet;
import java.util.Set;

/*Write an algorithm to determine if a number n is happy.

A happy number is a number defined by the following process:

    Starting with any positive integer, replace the number by the sum of the squares of its digits.
    Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
    Those numbers for which this process ends in 1 are happy.

Return true if n is a happy number, and false if not.



Example 1:

Input: n = 19
Output: true
Explanation:
12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1

Example 2:

Input: n = 2
Output: false



Constraints:

    1 <= n <= 231 - 1

*/

public class Solution02HappyNumber202 {
    public static void main(String[] args) {
        // some happy numbers : 1, 10, 19, 32, 68, 82, 100
        System.out.println(isHappy(32));
    }

    public static boolean isHappy(int n) {

        Set<Integer> usedNumber = new HashSet<>();
        while (true) {
            int sum = 0;
            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }

            if (sum == 1) {
                return true;
            }
            n = sum;

            if (usedNumber.contains(n)) {
                return false;
            }
            usedNumber.add(n);
        }
    }
}
