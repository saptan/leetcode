package leetcode_75_days.day_1;

public class FindPivotIndex {
    public int pivotIndex(int[] nums) {

        int sumTotal = 0;
        for (int num : nums) {
            sumTotal += num;
        }

        int sumLeft = 0;
        for (int i = 0; i < nums.length; i++) {

            if (sumLeft * 2 == sumTotal - nums[i]) {
                return i;
            }

            sumLeft += nums[i];

        }

        return -1;
    }
}
