package leetcode_75_days.day_7;

public class FirstBadVersion {
    public int firstBadVersion(int n) {

        if (isBadVersion(1)) {
            return 1;
        }

        int left = 1;
        int right = n;

        while (left < right) {

            int middle = left + (right - left) / 2;

            if (isBadVersion(middle)) {
                right = middle;
            } else {
                left = middle + 1;
            }
        }

        return left;
    }

    private boolean isBadVersion(int version) {
        return true; // todo stub
    }
}
