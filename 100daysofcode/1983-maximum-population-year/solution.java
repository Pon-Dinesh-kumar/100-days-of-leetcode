class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] arr = new int[101];

        for (int i = 0; i < logs.length; i++) {
            arr[logs[i][0] - 1950]++;
            arr[logs[i][1] - 1950]--;
        }

        int max = 0;
        int sum = 0;
        int ans = 0;

        for (int i = 0; i < 100; i++) {
            sum += arr[i];
            if (sum > max) {
                max = sum;
                ans = i;
            }
        }

        return 1950 + ans;
    }
}

