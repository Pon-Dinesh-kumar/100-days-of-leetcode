class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            int contribution = ((i + 1) * (n - i) + 1) / 2; // Calculate contribution for odd-length subarrays
            ans += arr[i] * contribution;
        }

        return ans;
    }
}

