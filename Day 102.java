class Solution {
    public int[] evenOddBit(int n) {

        int length = 0;
        int even =0;
        int odd = 0;

        while(n!=0){
            length++;
            if((n&1)==1){
                if(length%2==0){
                    even++;
                }
                else{
                    odd++;
                }
            }
            n = n>>1;
        }

       
        return new int[]{odd, even};
        
    }
}
