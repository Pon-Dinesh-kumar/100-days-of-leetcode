class Solution {
    public boolean isPowerOfThree(int n) {
        if (n > 1) {
            if(n%3==0){
                return isPowerOfThree(n / 3);
            }
            else{
                return false;
            }
        } else {
            return n == 1;
        }
    }
}
