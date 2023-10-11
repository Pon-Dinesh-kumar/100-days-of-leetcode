class Solution {
    public boolean findRotation(int[][] a, int[][] b) {
        int n = a.length;
        int c90 = 0, c180 = 0, c270 = 0, c0 = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] == b[n - j - 1][i])
                    c90++;
                if (a[i][j] == b[n - i - 1][n - j - 1])
                    c180++;
                if (a[i][j] == b[j][n - i - 1])
                    c270++;
                if (a[i][j] == b[i][j])
                    c0++;
            }
        }

        if (c90 == n * n || c270 == n * n || c180 == n * n || c0 == n * n)
            return true;
        else
            return false;
    }
}

