class Solution {
    public int findShortestSubArray(int[] nums) {
        int freq[]= new int[50000];
        int degree = 0;
        int firstIndex[]=new int[50000];
        int lastIndex[]=new int[50000];
        for(int i=0;i<nums.length;i++){
            if(freq[nums[i]]==0){
                firstIndex[nums[i]] = i;
                lastIndex[nums[i]]= i;
            }else{
                lastIndex[nums[i]]=i;
            }
            freq[nums[i]]++;
            if(degree<freq[nums[i]]){
                degree = freq[nums[i]];
            }
        }
        int res= 50000;
        for(int i=0;i<freq.length;i++){
            if(freq[i]==degree){
                res = Math.min(res,lastIndex[i]-firstIndex[i]+1);
            }
        }
        return res;
    }
    
}
