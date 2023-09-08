class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        while(count<nums.length - 1){
            if (nums[count] == nums[count+1]){
                return true;
            }
            count++;
        }
        return false;
        
    }

}
