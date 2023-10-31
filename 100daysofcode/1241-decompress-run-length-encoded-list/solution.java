class Solution {
    public int[] decompressRLElist(int[] nums) {

        int len = 0;

        for(int i =0; i<nums.length; i+=2){
            len+=nums[i];
        }

        int[] ans = new int[len];
        int j = 0;

        for(int i =1; i<nums.length;i+=2){

            while(nums[i-1]>0){
                ans[j]=nums[i];
                j++;
                nums[i-1]--;
            }

        }

        return ans;
        
    }
}
