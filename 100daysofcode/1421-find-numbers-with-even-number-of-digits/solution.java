class Solution {
    public int findNumbers(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int count = 0;
        for(int i =0; i<nums.length;i++){
            int len = 0;
            while(nums[i]>0){
                len++;
                nums[i]=nums[i]/10;
            }
            if(len%2 == 0){
                count++;
            }
        }
        return count;
    }
}
