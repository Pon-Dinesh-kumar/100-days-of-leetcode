class Solution {
    public int[] leftRightDifference(int[] nums) {

        int left = 0;
        int[] nums1 = new int[nums.length];

        for(int i=0; i<nums1.length; i++){
            nums1[i] = left;
            left+=nums[i];
        }

        left = 0;

        for(int i = nums.length-1; i>=0; i--){
            int temp = Math.abs(nums1[i]-left);
            left+=nums[i];
            nums[i] = temp;
        }

        return nums;
        
    }
}
