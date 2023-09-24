class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean flag = true;
        if(nums.length==1){
            return true;
        }
        if(nums.length==1){
            return false;
        }

        if(nums[0]>nums[nums.length-1]){
            for(int i = 0; i< nums.length-1; i++){
                if(nums[i]<nums[i+1]){
                    flag = false;
                }
            }
        }
        else if(nums[0]<nums[nums.length-1]){
            for(int i = 0; i< nums.length-1; i++){
                if(nums[i]>nums[i+1]){
                    flag = false;
                }
            }
        }
        else{
        Arrays.sort(nums);
        if(nums[nums.length-1]==nums[0]){
            return true;
        }
        else{
            flag = false;
        }}
        
        return flag;

        
    }
}
