class Solution {
    public int longestValidParentheses(String s) {
        if(s.length()==0){
            return 0;
        }
         int[] arr = new int[s.length()];
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                arr[i]=1;
            }
            else{
                arr[i]=-1;
            }
        }
        int ans=0;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]==1){
                int temp =1;
                int c=1;
                for(int j=i+1; j<arr.length;j++){
                    temp+=arr[j];
                    if(temp<0){
                        break;
                    }
                    c++;
                    if(temp==0){
                        ans = Math.max(ans,c);
                    }
                }
            }
        }
        return ans;
        
    }
}