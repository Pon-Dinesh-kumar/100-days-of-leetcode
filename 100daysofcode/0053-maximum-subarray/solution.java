class Solution {
    public int maxSubArray(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int sum = nums[0];
        int temp = nums[0];

        for (int i = 1; i < nums.length; i++) {
            temp = Math.max(nums[i], temp + nums[i]);
            sum = Math.max(sum, temp);
        }

        return sum;
    }
}

