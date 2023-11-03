class Solution {
    public int[] separateDigits(int[] nums) {
        int totalDigits = 0;

        for (int num : nums) {
            if (num == 0) {
                totalDigits++;
            } else {
                while (num > 0) {
                    totalDigits++;
                    num /= 10;
                }
            }
        }

        int[] ans = new int[totalDigits];
        int index = totalDigits-1;

        for(int i=nums.length-1;i>=0;i--) {
            if (nums[i] == 0) {
                ans[index--] = 0;
            } else {
                while (nums[i] > 0) {
                    ans[index--] = nums[i] % 10;
                    nums[i] /= 10;
                }
            }
        }

        return ans;
    }
}

