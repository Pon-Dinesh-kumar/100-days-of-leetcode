class Solution {
    public List<Integer> findDuplicates(int[] nums) {

        ArrayList<Integer> ans = new ArrayList<>();

        for(int num:nums){
            int i = Math.abs(num)-1;
            if(nums[i]<0){
                ans.add(Math.abs(num));
            }
            else{
                nums[i] = -nums[i];
            }
        }

        return ans;
        
    }
}
