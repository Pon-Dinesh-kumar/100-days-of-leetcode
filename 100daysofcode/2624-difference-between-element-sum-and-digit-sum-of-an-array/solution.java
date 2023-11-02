class Solution {
    public int differenceOfSum(int[] nums) {

        int element = 0;
        int digit = 0;

        for(int i =0; i<nums.length; i++){
            element+= nums[i];

            while(nums[i]>0){
                digit+= nums[i]%10;
                nums[i] = nums[i]/10;
            }
        }

        return Math.abs(element-digit);
        
    }
}
