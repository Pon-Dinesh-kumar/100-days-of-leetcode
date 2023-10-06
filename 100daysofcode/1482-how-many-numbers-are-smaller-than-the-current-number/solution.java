class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {

        int[] ans = new int[nums.length];

        for(int i =0; i<nums.length; i++){
            ans[i] = small(i, nums);
        }
       return ans; 
    }

    int small(int n, int[] nums){
        int count = 0;
        for(int i =0; i<nums.length; i++){
            if(nums[n]>nums[i]){
                count++;
            }
        }
        return count;
    }
}
