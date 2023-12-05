class Solution {
    public String defangIPaddr(String address) {
        StringBuilder str = new StringBuilder();
        char[] c = address.toCharArray();
        for(int i=0; i<c.length;i++){
            if(c[i]=='.'){
                str.append("[.]");
            }
            else{
                str.append(c[i]);
            }
        }
        address = str.toString();
        return address;
        
    }
}
