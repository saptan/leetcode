package leetcode_75_days.day_5;

import java.util.HashSet;
import java.util.Set;

public class LongestPalindrome {
    public int longestPalindrome(String s) {
        if (s == null || s.length() == 0) return 0;
        Set<Character> set = new HashSet<>();
        int count = 0;
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (set.remove(c)) {
                count++;
            } else {
                set.add(c);
            }
        }
        return set.isEmpty() ? count * 2 : count * 2 + 1;
    }
}
