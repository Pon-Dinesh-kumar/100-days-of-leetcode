class Solution {
    public String replaceDigits(String s) {

        StringBuilder str = new StringBuilder();

        for(int i=0; i<s.length()-1;i+=2){
            str.append(s.charAt(i));
            int num = (int)(s.charAt(i+1));
            num-=48;
            str.append((char)(s.charAt(i)+num));
        }
        if(s.length()%2==1){
            str.append(s.charAt(s.length()-1));
        }
        
        return str.toString();
    }
}