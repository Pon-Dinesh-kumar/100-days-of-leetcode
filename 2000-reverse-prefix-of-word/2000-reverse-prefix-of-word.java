class Solution {
    public String reversePrefix(String word, char ch) {

        StringBuilder str = new StringBuilder();

        for(int i=0; i<word.length();i++){
            char let = word.charAt(i);
            if(let==ch){
                str.append(let);
                str.reverse();
                ch='*';
            }
            else{
                str.append(let);
            }
        }
        return str.toString();
    }
}