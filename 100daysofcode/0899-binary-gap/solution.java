class Solution {
    public int binaryGap(int n) {

        int max =0;
        int c =0;
        int pos =0;
        boolean flag = true;

        while(n!=0){
            if((n&1)==1){
                if(flag){
                    pos = c;
                    flag = false;
                }
                max = Math.max(max, (c-pos));
                pos =c;
            }
            c++;
            n=n>>1;
        }
        return max;
        
    }
}
