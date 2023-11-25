class Solution {
    public boolean divideArray(int[] nums) {
        int[] temp = new int[502]; // Since 1 <= nums[i] <= 500, you need an array of size 1001
        for (int i : nums) {
            temp[i]++;
        }
        for (int count : temp) {
            if (count % 2 != 0) {
                return false;
            }
        }
        return true;
    }
}

