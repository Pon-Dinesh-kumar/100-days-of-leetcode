class Solution {
    public int findComplement(int num) {
        int ans = 0;
        int c = 1;

        while (num != 0) {
            int temp = (num & 1) ^ 1;
            ans += temp * c;
            c <<= 1; // Update c by left-shifting
            num = num >> 1;
        }

        return ans;
    }
}

