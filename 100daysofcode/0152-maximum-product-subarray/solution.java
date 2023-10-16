class Solution {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int pre = 1;
        int post =1;

        for(int i=0; i< nums.length; i++){
            if(pre==0){
                pre=1;
            }
            if(post==0){
                post =1;
            }
            pre = pre*nums[i];
            post = post*nums[nums.length-1-i];
            max = Math.max(max,pre);
            max = Math.max(max,post);
        }
        return max;
    }
}
