class Solution {
    public int[] nextGreaterElements(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap();

        for (int i = 0; i < nums.length; i++) {
            int next = -1;
            boolean flag = true;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] > nums[i]) {
                    next = nums[j];
                    flag = false;
                    break;
                }
            }
            if(flag){
                for (int j = 0; j < i; j++) {
                    if (nums[j] > nums[i]) {
                        next = nums[j];
                         break;
                    }
                }
            }                    
            map.put(i, next);
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = map.get(i);
        }

        return nums;
        
    }
}
