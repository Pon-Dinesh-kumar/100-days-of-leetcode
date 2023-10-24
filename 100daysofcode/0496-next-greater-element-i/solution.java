class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i =0; i< nums2.length; i++){
            int next  = -1;
            for(int j=i+1; j<nums2.length; j++){
                if(nums2[j]>nums2[i]){
                    next = nums2[j];
                    break;
                }
            }
            map.put(nums2[i], next);
        }

        for(int i=0; i<nums1.length; i++){
            nums1[i] = map.get(nums1[i]);
        }

        return nums1;
        
    }
}
