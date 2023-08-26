class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        int maj = len/2 +1;
        int count = 0;
        int ans = 1;

        while(count<len-1){
            if( nums[count] == nums[count+1] ){
                ans++;
                if (ans == maj){
                    return nums[count];
                }
            }
            else{
                ans = 1;
            }
            count++;

        }
        return nums[0];
        
    }
}
