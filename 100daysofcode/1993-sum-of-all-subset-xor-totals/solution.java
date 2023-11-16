class Solution {
    public int subsetXORSum(int[] nums) {
        int[] result = {0};
        backtrack(nums, 0, 0, result);
        return result[0];
    }

    private static void backtrack(int[] nums, int start, int currentXOR, int[] result) {
        result[0] += currentXOR;
        for (int i = start; i < nums.length; i++) {
            backtrack(nums, i + 1, currentXOR ^ nums[i], result);
        }
    }

   
}
