class Solution {
    public int countKDifference(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int number : nums) {
            if (map.containsKey(number)) {
                int count = map.get(number);
                map.put(number, count + 1);
            } else {
                map.put(number, 1);
            }
        }

        int ans = 0;

        for(int i=0; i<nums.length;i++){
            if(map.containsKey(nums[i]-k)){
                ans+=map.get(nums[i]-k);
            }
            if(map.containsKey(nums[i]+k)){
                ans+=map.get(nums[i]+k);
            }
            int temp = map.get(nums[i]);
            map.put(nums[i],temp-1);
        }

        return ans;
        
    }
}
