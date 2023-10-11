class Solution {
    public int[] sumZero(int n) {

        if(n == 0){
            return new int[0];
        }
        else if(n==1){
            return new int[1];
        }
        
        int[] ans = new int[n];
        int num =(n/2)*-1;
        
        if(n%2 != 0){
            for(int i=0; i<n; i++){
                ans[i] = num;
                num++;
            }
        }
        else{
            for(int i=0; i<n; i++){
                if(num == 0){
                    i = i-1;
                }else{
                    ans[i] = num;
                }
                num++;
            }
        }

        return ans;
        
    }
}
