package leetcode_75_days.day_2;

import java.util.*;

public class IsomorphicStrings {
    public static boolean isIsomorphicWithMap(String s, String t) {

        Map<Character, Character> map = new HashMap<>();
        Set<Character> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {

            char charS = s.charAt(i);
            char charT = t.charAt(i);


            if (map.containsKey(charS)) {
                if (map.get(charS) != charT) {
                    return false;
                }
            } else {

                if (set.contains(charT)) {
                    return false;
                }

                map.put(charS, charT);
                set.add(charT);
            }
        }

        return true;
    }

    public static boolean isIsomorphicWithArray(String s, String t) {

        int[] sChar = new int[256];
        int[] tChar = new int[256];
        Arrays.fill(sChar, -1);
        Arrays.fill(tChar, -1);

        for (int i = 0; i < s.length(); i++) {
            int sCharIdx = s.charAt(i);
            int stCharIdx = t.charAt(i);
            if (sChar[sCharIdx] == -1 && tChar[stCharIdx] == -1) {
                sChar[sCharIdx] = stCharIdx;
                tChar[stCharIdx] = sCharIdx;
            } else if (sChar[sCharIdx] != stCharIdx || tChar[stCharIdx] != sCharIdx) {
                return false;
            }
        }
        return true;
    }
}
