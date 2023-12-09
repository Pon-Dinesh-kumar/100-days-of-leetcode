class Solution {
    public boolean judgeCircle(String moves) {
        int[] arr = {0,0};

        for(int i=0; i<moves.length();i++){
            char ch = moves.charAt(i);
            if(ch=='U'){
               arr[0]++; 
            }
            else if(ch=='D'){
               arr[0]--; 
            }
            else if(ch=='R'){
               arr[1]++; 
            }
            else{
               arr[1]--; 
            }
        }
        if(arr[0]==0 && arr[1]==0){
            return true;
        }
        return false;
        
    }
}