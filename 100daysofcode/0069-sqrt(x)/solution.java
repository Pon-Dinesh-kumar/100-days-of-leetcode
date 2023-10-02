class Solution {
    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        if (x <= 3) {
            return 1;
        }
        long start = 0; // Use long to avoid integer overflow
        long end = x;
        long result = 0;

        while (start <= end) {
            long mid = start + (end - start) / 2;
            long square = mid * mid;

            if (square == x) {
                return (int) mid;
            } else if (square < x) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return (int) end;
    }
}

