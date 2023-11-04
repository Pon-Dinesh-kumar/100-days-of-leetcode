class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int c = 0;

        for (int i = 0; i < nums.length - 2; i++) {
            if (search(i + 1, nums, nums[i] + diff)) {
                if (search(i + 1, nums, nums[i] + diff + diff)) {
                    c++;
                }
            }
        }

        return c;
    }

    public boolean search(int start, int[] nums, int target) {
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return true;
            } else if (nums[mid] > target) {
                end = mid - 1; 
            } else {
                start = mid + 1;
            }
        }

        return false;
    }
}

