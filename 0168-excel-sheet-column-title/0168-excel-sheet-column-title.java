class Solution {
    public String convertToTitle(int columnNumber) {

        int n = columnNumber;

        StringBuilder str = new StringBuilder();

        while(n!=0){
            char last = (char)(n%26);
            if(n%26==0){
                str.append('Z');
                n=n-1;
            }
            else{
                last+=64;
                 str.append(last);
                
            }
            
            n=n/26;
        }
        return str.reverse().toString();
    }
}