class Solution {
    public int countMaxOrSubsets(int[] nums) {
        int maxOr = 0;
        int length = nums.length;
        int totalSubsets = 1 << length;
        int count = 0;

        for (int i = 1; i < totalSubsets; i++) {
            int temp = i;
            int tempOr = 0;
            int index = 0;

            while (temp != 0) {
                if ((temp & 1) == 1) {
                    tempOr |= nums[index];
                }
                temp = temp >> 1;
                index++;
            }

            if (tempOr == maxOr) {
                count++;
            } else if (tempOr > maxOr) {
                maxOr = tempOr;
                count = 1;
            }
        }

        return count;
    }
}
