class Solution {
    public int splitArray(int[] nums, int k) {
        int arrMax = Integer.MIN_VALUE;
        int arrSum = 0;

        for (int i = 0; i < nums.length; i++) {
            arrMax = Math.max(arrMax, nums[i]);
            arrSum += nums[i];
        }

        while (arrMax <= arrSum) {
            int mid = arrMax + (arrSum - arrMax) / 2;
            if (checkSplit(mid, k, nums)) {
                arrSum = mid - 1;
            } else {
                arrMax = mid + 1;
            }
        }

        return arrMax;
    }

    boolean checkSplit(int mid, int k, int[] nums) {
        int split = 1;
        int sum = 0; 
        for (int i = 0; i < nums.length; i++) {
            if (sum + nums[i] <= mid) { 
                sum += nums[i];
            } else {
                split++;
                sum = nums[i];
            }
        }

        return split <= k;
    }
}

