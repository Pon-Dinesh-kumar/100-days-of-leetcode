public class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        int len = 0;

        for (int num : nums) {
            int insertIndex = findInsertIndex(dp, len, num);
            dp[insertIndex] = num;

            if (insertIndex == len) {
                len++;
            }
        }

        return len;
    }

    private int findInsertIndex(int[] dp, int len, int target) {
        int left = 0;
        int right = len;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (dp[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }
}

