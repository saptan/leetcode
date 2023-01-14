package leetcode_75_days.day_7;

public class BinarySearch {
    public int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {

            int middle = (left + right) / 2;
            int currentNumber = nums[middle];

            if (currentNumber == target) {
                return middle;
            } else if (currentNumber < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return -1;
    }
}
