class Solution {
    public int pivotInteger(int n) {

        if (n == 1) {
            return 1;
        }

        int start = 1;
        int end = n;
        int presum = 0;
        int postsum = 0;

        while (start < end) {
            if (presum < postsum) {
                presum += start;
                start++;
            } else if (postsum < presum) {
                postsum += end;
                end--;
            } else {
                presum += start;
                start++;
            }
        }

        if (start == n) {
            return -1;
        }

        return presum == postsum ? start : -1;
    }
}

