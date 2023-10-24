class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length/3;
        ArrayList<Integer> list = new ArrayList<>();
        if(nums.length==1){
            list.add(nums[0]);
            return list;
        }
        else if(nums.length==2){
            if(nums[0]==nums[1]){
                list.add(nums[0]);
                return list;
            }
            else{
                list.add(nums[0]);
                list.add(nums[1]);
                return list;
            }
        }
        
        int c=0;

        Arrays.sort(nums);

        for(int i=0; i<nums.length-1; i++){
            if(nums[i]==nums[i+1]){
                c++;
                if(c==n){
                    list.add(nums[i]);
                }
            }
            else{
                c=0;
            }
        }
        return list;
        
    }
}
