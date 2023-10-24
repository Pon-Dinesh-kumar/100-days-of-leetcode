class Solution {
    public int mostFrequentEven(int[] nums) {
        if(nums.length==1){
            if(nums[0]%2==0){
                return nums[0];
            }
            else{
                return -1;
            }
        }
        Arrays.sort(nums);
        int temp = 1;
        int max = 0;
        int ans = -1;

        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] % 2 == 0) {
                if (nums[i] == nums[i + 1]) {
                    temp++;
                }
                if (temp > max) {
                    max = temp;
                    ans = nums[i];
                } else if(nums[i]!=nums[i+1]) {
                    temp = 1;
                }
            }
        }
        if(ans==-1){
            if(nums[nums.length-1]%2==0){
                return nums[nums.length-1];
            }
        }
        return ans;
    }
}

