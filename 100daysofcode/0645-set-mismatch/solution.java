class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int rep = 0;
        int sum = 0;
        int son = (n * (n + 1)) / 2;

        for (int i = 0; i < n; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0) {
                rep = index + 1; 
            } else {
                nums[index] *= -1; 
            }
            sum += Math.abs(nums[i]);
        }

        return new int[]{rep, (son - sum + rep)};
    }
}

