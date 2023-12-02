class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int n = nums.length-1;
        int[] result = new int[n+1];
        int maxXOR = (1 << maximumBit) - 1;
        int xorSum = 0;

        for (int num : nums) {
            xorSum ^= num;
        }

        for (int i = n; i >= 0; i--) {
            result[n - i] = maxXOR ^ xorSum;
            xorSum ^= nums[i];
        }

        return result;
    }
}
