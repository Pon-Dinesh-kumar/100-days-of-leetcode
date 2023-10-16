class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return nums[0];
        }

        // First, compute the maximum robbing value without robbing the last house
        int[] withoutLast = new int[n];
        withoutLast[0] = nums[0];
        withoutLast[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < n - 1; i++) {
            withoutLast[i] = Math.max(withoutLast[i - 2] + nums[i], withoutLast[i - 1]);
        }

        // Then, compute the maximum robbing value without robbing the first house
        int[] withoutFirst = new int[n];
        withoutFirst[0] = 0; // Cannot rob the first house
        withoutFirst[1] = nums[1];

        for (int i = 2; i < n; i++) {
            withoutFirst[i] = Math.max(withoutFirst[i - 2] + nums[i], withoutFirst[i - 1]);
        }

        // Return the maximum value from the two scenarios
        return Math.max(withoutLast[n - 2], withoutFirst[n - 1]);
    }
}

