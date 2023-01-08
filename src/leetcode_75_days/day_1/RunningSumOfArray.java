package leetcode_75_days.day_1;

public class RunningSumOfArray {
    public static int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];

        int runningSum = 0;

        for (int i = 0; i < nums.length; i++) {
            runningSum += nums[i];
            result[i] = runningSum;
        }

        return result;
    }
}
