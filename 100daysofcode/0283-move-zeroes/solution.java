class Solution {
    public int[] moveZeroes(int[] nums) {

        int[] ans = new int[nums.length];
        int end = 1;
        int start = 0;

        for(int i = 0; i< nums.length; i++){
            if(nums[i] == 0){
                ans[nums.length - end] = 0;
                end++;

            }
            else{
                ans[start] = nums[i];
                start++;
            }
        }
        for(int i = 0 ; i< nums.length; i++){
            nums[i] = ans [i];
        }
        return nums;
        
    }
}
