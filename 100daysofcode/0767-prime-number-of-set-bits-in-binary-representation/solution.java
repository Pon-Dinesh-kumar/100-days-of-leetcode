class Solution {
    public int countPrimeSetBits(int left, int right) {
        int ans = 0;

        for (int i = left; i <= right; i++) {
            if (setPrime(i)) {
                ans++;
            }
        }

        return ans;
    }

    public boolean setPrime(int num) {
        int count = 0;

        while (num > 0) {
            num &= (num - 1);
            count++;
        }

        if (count <= 1) {
            return false;
        }

        for (int i = 2; i * i <= count; i++) {
            if (count % i == 0) {
                return false;
            }
        }

        return true;
    }
}

