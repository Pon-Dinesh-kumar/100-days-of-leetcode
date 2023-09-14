import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int num = Math.abs(nums[i]);

            if (nums[num - 1] > 0) {
                nums[num - 1] = -nums[num - 1];
            }
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                arr.add(i + 1);
            }
        }

        return arr;
    }
}

