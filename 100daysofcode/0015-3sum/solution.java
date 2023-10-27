class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        ArrayList<List<Integer>> list = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];

                if (sum > 0) {
                    k--;
                } else if (sum < 0) {
                    j++;
                } else {
                    // Create a list with the three elements and add it to the result list
                    List<Integer> triplet = new ArrayList<>();
                    triplet.add(nums[i]);
                    triplet.add(nums[j]);
                    triplet.add(nums[k]);
                    list.add(triplet);

                    while (j < k && nums[j + 1] == nums[j]) {
                        j++;
                    }

                    j++;

                    while (j < k && nums[k - 1] == nums[k]) {
                        k--;
                    }

                    k--;
                }
            }

            while (i < nums.length - 2 && nums[i] == nums[i + 1]) {
                i++;
            }
        }

        return list;
    }
}

