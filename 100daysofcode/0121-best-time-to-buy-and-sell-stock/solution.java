public class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;

        if (len <= 1) {
            return 0; 
        }
        
        int[] arr = new int[len - 1];

        for (int i = 0; i < len - 1; i++) {
            arr[i] = prices[i + 1] - prices[i]; 
        }

        return maxSubarraySum(arr);
    }

    public int maxSubarraySum(int[] nums) {
        int maxEndingHere = nums[0];
        int maxSoFar = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            maxEndingHere = Math.max(nums[i], maxEndingHere + nums[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        if(maxSoFar<0){
            return 0;
        }
        return maxSoFar;
    }
}

