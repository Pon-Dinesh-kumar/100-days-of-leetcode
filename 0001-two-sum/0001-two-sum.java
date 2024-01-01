class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Map to store the numbers and their indices
        Map<Integer, Integer> numIndices = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // Check if the complement is present in the map
            if (numIndices.containsKey(complement)) {
                // Return the indices of the two numbers
                return new int[]{numIndices.get(complement), i};
            }

            // Add the current number and its index to the map
            numIndices.put(nums[i], i);
        }

        // If no solution is found, return an empty array or throw an exception
        return new int[0];
    }
}