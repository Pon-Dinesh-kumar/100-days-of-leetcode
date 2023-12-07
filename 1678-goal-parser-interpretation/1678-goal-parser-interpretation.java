class Solution {
    public String interpret(String command) {
        StringBuilder str = new StringBuilder();
        for(int i=0;  i<command.length();i++){
            char ch = command.charAt(i);
            if(ch=='G'){
                str.append('G');
            }
            else if(ch=='('){
                if(command.charAt(i+1)==')'){
                    str.append('o');
                    i++;
                }
                else{
                    str.append('a');
                    str.append('l');
                    i+=3;
                }
            }
        }
        return str.toString();
        
    }
}