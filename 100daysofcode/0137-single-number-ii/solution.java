class Solution {
    public int singleNumber(int[] nums) {

        int ans = 0;

        for (int i = 0; i < 32; i++) {
            int one = 0;
            for (int j = 0; j < nums.length; j++) {
                if (((1 << i) & nums[j]) != 0) {
                    one++;
                }
            }
            if (one % 3 != 0) {
                ans = ans | (1 << i);
            }
        }

        return ans;
    }
}

