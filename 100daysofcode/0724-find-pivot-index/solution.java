class Solution {
    public int pivotIndex(int[] nums) {

        int right = 0;
        int[] nums1 = new int[nums.length];

        for(int i=nums.length-1; i>=0; i--){
            nums1[i] = right;
            right+=nums[i];
        }

        int left = 0;

        for(int i = 0; i<nums.length; i++){
            int temp = nums1[i]-left;
            if(temp==0){
                return i;
            }
            left+=nums[i];
            nums[i] = temp;
        }

        return -1;        
    }
}
