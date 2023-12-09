class Solution {
    public String reverseWords(String s) { 
        StringBuilder ans = new StringBuilder();
                    StringBuilder str = new StringBuilder();
        for(int i=0; i<s.length();i++){

            char ch = s.charAt(i);
            if(ch==' '){
                ans.insert(ans.length(), str.reverse().toString());
                ans.append(' ');
                str.setLength(0);
            }
            else{
                str.append(ch);
            }
        }
        ans.insert(ans.length(), str.reverse().toString());
        return ans.toString();
        
    }
}