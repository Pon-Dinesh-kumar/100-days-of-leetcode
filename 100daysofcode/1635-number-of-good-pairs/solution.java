class Solution {
    public int numIdenticalPairs(int[] nums) {
        Arrays.sort(nums);
        int count = 1;
        int pointer = nums[0];
        int ans = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == pointer) {
                count++;
            } else {
                ans += (count * (count - 1)) / 2;
                pointer = nums[i];
                count = 1;
            }
        }
        ans += (count * (count - 1)) / 2;

        return ans;
    }
}

