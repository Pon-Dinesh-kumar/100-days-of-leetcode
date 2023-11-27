class Solution {
    
    // Function to return sum of count of set bits in the integers from 1 to n.
    public static int countSetBits(int n){
        int ans = 0;
        int[] dp = new int[n + 1];
        
        for (int i = 1; i <= n; i++) {
            if(i==0){
                dp[i]=0;
            }
            else if(i==1||i==2){
                dp[i]=1;
            }
            else if(i%2==1){
                dp[i] = dp[i-1] +1;
            }
            else{
                dp[i] = dp[i/2];
            }
            ans+=dp[i];
        }
        
        return ans;
    }
}
