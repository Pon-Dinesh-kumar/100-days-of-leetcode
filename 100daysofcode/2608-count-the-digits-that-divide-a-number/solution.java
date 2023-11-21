class Solution {
    public int countDigits(int num) {

        int ans =0;
        int n = num;

        while(n>0){
            int temp = n%10;
            if(num%temp==0){
                ans++;
            }
            n=n/10;
        }    

        return ans;    
    }
}
