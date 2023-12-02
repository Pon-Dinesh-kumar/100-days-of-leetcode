class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        int totalSubsets = 1 << n;

        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < totalSubsets; i++) {

            ArrayList<Integer> sub = new ArrayList<>();

            int temp = i;
            int count = 0;

            while (temp != 0) {
                if ((temp & 1) == 1) {
                    sub.add(nums[count]);
                }
                count++;
                temp = temp >> 1;
            }

            list.add(sub);
        }

        return list;
    }
}
