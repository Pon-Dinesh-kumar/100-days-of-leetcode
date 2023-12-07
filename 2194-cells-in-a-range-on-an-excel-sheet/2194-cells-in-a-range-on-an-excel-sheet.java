class Solution {
    public List<String> cellsInRange(String s) {
        char c1 = s.charAt(0);
        char c2 = s.charAt(3);

        char n1 = s.charAt(1);
        char n2 = s.charAt(4);

        List<String> ans = new ArrayList<>();

        for(char i = c1; i<=c2; i++){
            
            for(char j= n1; j<=n2; j++){
               StringBuilder str = new StringBuilder();
               str.append(i);
               str.append(j);
               ans.add(str.toString());
            }
            
        }

        return ans;
        
    }
}