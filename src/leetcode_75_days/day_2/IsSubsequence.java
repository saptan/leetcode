package leetcode_75_days.day_2;

public class IsSubsequence {
    public static boolean isSubsequence(String s, String t) {

        if (s.isEmpty()) {
            return true;
        }

        if (t.isEmpty()) {
            return false;
        }

        int currentIndex = 0;

        for (int i = 0; i < t.length(); i++) {

            char sChar = s.charAt(currentIndex);
            char tChar = t.charAt(i);

            if (sChar == tChar) {
                currentIndex++;
            }

            if (currentIndex >= s.length()) {
                return true;
            }
        }

        return false;

    }
}
