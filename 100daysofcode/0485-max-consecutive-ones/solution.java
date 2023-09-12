class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int ans = 0;
        
        for (int num : nums) {
            if (num == 1) {
                count++;
            } else {
                if (count > ans) {
                    ans = count;
                }
                count = 0;
            }
        }
        
        if (count > ans) {
            ans = count;
        }
        
        return ans;
    }
}

