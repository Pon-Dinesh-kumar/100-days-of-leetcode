class Solution {
    public boolean isHappy(int n) {
        if (n == 1) {
            return true; 
        } else if (n == 4) {
            return false; 
        } else {
            int sum = 0;
            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }
            return isHappy(sum);
        }
    }
}

