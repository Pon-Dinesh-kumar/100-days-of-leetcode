class Solution {
    public boolean isPalindrome(int x) {

        if (x < 0) {
            return false; 
        }
        
        
        String s = Integer.toString(x);
        int len = s.length();
        int temp = x;

        int[] arr = new int[len];

        for(int i = 0; i < len; i++){
            arr[i] = x % 10;
            x = x / 10;
        }

        int ans = 0;
        for(int i = 0; i < len; i++){
            ans = ans * 10 + arr[i]; 
        }
        
        return ans == temp; 
    }
}
