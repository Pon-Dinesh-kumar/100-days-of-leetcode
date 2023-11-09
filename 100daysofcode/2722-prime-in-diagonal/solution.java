class Solution {
    public int diagonalPrime(int[][] nums) {
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            if (isPrime(nums[i][i])) {
                max = Math.max(max, nums[i][i]);
            }
            
            // Fix the second part of the loop
            if (isPrime(nums[i][nums.length - i - 1])) {
                max = Math.max(max, nums[i][nums.length - i - 1]);
            }
        }

        return max;
    }

    public boolean isPrime(int n) {
        if (n <= 1) 
            return false; 
  
        if (n == 2 || n == 3) 
            return true; 
  
        if (n % 2 == 0 || n % 3 == 0) 
            return false; 
  
        for (int i = 5; i * i <= n; i = i + 6) 
            if (n % i == 0 || n % (i + 2) == 0) 
                return false; 
  
        return true; 
    }
}

