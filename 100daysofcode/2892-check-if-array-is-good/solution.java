class Solution {
    public boolean isGood(int[] nums) {
        int count = 0;

        if (nums.length == 1) {
            return false;
        }

        if (nums.length == 2) {
            if (nums[0] == nums[1] && nums[0]==1) {
                return true;
            }
            else{
                return false;
            }
        }

        Arrays.sort(nums);

        if (nums[nums.length - 1]+1 == nums.length) {
            if (nums[nums.length - 2]+1 == nums.length) {
                for (int i = 0; i < nums.length - 2; i++) {
                    if (nums[i] == i + 1) {
                        count++;
                    }
                }
            }
        }

        return count == nums.length - 2;
    }
}

