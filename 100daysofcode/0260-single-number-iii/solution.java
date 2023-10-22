class Solution {
    public int[] singleNumber(int[] nums) {
        int ans[]=new int[2];
        int xor=0;
        //find the XOR of all the numbers
        for(int i=0;i<nums.length;i++){
            xor=xor^nums[i];
            
        }
       
        //find the rightmost set bit (rmsb of x=x & 2's compliment of x)
        int rmsb=xor&(~xor+1);
        //find the group of number whose bit corresponding to righmost set bit is on and similiarly find the group with bit corresponding to rsb is off and then find the xor of both group you will get the 2 number
        
        for(int i=0;i<nums.length;i++){
            if((nums[i]&rmsb)==rmsb){
                ans[0]=ans[0]^nums[i];
            }
            else{
                ans[1]=ans[1]^nums[i];
            }
        }
        return ans;
        
    }
}
