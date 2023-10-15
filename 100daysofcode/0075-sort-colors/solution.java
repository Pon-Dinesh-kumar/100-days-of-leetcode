class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        cycle(nums, low, high);
    }

    public void cycle(int[] nums, int low, int high) {
        if (low >= high) {
            return; // Termination condition for recursion
        }
        int pivot = nums[high];
        int s = low;
        int e = high;

        while (s <= e) {
            if (nums[s] >= pivot && nums[e] <= pivot) {
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            } else if (nums[s] >= pivot) {
                e--;
            } else {
                s++;
            }
        }

        cycle(nums, low, e);
        cycle(nums, s, high);
    }
}

