class Solution {
    public int findLHS(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        if(nums.length==1){
            return 0;
        }
        Arrays.sort(nums);
        int maxCount = 0;
        int currentCount = 1;
        int prevCount = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                currentCount++;
            } else if (nums[i] - nums[i - 1] == 1) {
                prevCount = currentCount;
                currentCount = 1;
            } else {
                prevCount = 0;
                currentCount = 1;
            }

            if (prevCount > 0) {
                maxCount = Math.max(maxCount, prevCount + currentCount);
            }
        }

        return maxCount;
    }
}

