class Solution {
    public String sortSentence(String s) {
        String[] arr = new String[58];
        StringBuilder str = new StringBuilder();
        for(int i=0; i<s.length();i++){
            char ch = s.charAt(i);
            if(ch>=48 && ch<=57){
                arr[(int)(ch)] = str.toString();
                str.setLength(0);
                i++;
            }
            else{
                str.append(ch);
            }
        }

        str.setLength(0);
        for(int i=48; i<=57; i++){
            if(arr[i] != null){
                str.insert(str.length(),arr[i]);
                str.append(' ');
            }
        }
        return str.toString().trim();
        
    }
}