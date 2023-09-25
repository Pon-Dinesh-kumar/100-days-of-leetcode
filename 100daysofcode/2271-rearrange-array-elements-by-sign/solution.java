class Solution {
    public int[] rearrangeArray(int[] nums) {
        if(nums.length == 0 || nums.length == 1){
            return nums;
        }
        int plus = 0;
        int minus = 1;
        int[] arr = new int[nums.length];
        for(int i = 0; i<nums.length; i++){
            if(nums[i]>0){
                arr[plus] = nums[i];
                plus+=2;
            }
            else{
                arr[minus] = nums[i];
                minus+=2;
            }
        }
        return arr;
        
    }
}
