class Solution {
    public int countAsterisks(String s) {
        int ans =0;
        int count =0;
        boolean flag = true;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='*'){
                count++;
            }
            if(ch=='|'){
                if(flag){
                    ans+=count;
                    flag=false;
                    count =0;
                }
                else{
                    count =0;
                    flag = true;
                }
            }
        }
        ans+=count;
        return ans;
    }
}