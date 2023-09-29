class Solution {
    public int reverse(int x) {
        long ans = 0;
        long y = (long) x;
        boolean flag = false;

        if (y < 0) {
            flag = true;
            y = -y; 
        }

        while (y > 0) {
            ans = ans * 10 + y % 10;
            y = y / 10;
        }

        if (ans > Integer.MAX_VALUE ) {
            return 0;
        }

        if (flag) {
            ans = -ans;
        }

        return (int) ans;
    }
}

