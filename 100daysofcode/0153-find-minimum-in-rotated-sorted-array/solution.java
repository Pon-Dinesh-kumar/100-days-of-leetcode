class Solution {
    public int findMin(int[] nums) {
    
        int start = 0;
        int end = nums.length - 1;

        if(nums[end]>nums[start]){
            return nums[start];
        }
        if(nums.length==1){
            return nums[0];
        }

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] > nums[start]) {
                start=mid;
            } else {
                end = mid;
            }
        }

        return nums[start+1];
        
    }
}
