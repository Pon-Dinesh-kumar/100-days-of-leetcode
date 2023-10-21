class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length; // Number of rows
        int n = obstacleGrid[0].length; // Number of columns

        // Check if the start position has an obstacle, and if it does, there's no path.
        if (obstacleGrid[0][0] == 1) {
            return 0;
        }

        // Initialize the top-left cell to 1, as there's only one way to reach it.
        obstacleGrid[0][0] = 1;

        // Initialize the first row. If there's an obstacle, set subsequent cells to 0.
        for (int j = 1; j < n; j++) {
            if (obstacleGrid[0][j] == 1) {
                obstacleGrid[0][j] = 0;
            } else {
                obstacleGrid[0][j] = obstacleGrid[0][j - 1];
            }
        }

        // Initialize the first column. If there's an obstacle, set subsequent cells to 0.
        for (int i = 1; i < m; i++) {
            if (obstacleGrid[i][0] == 1) {
                obstacleGrid[i][0] = 0;
            } else {
                obstacleGrid[i][0] = obstacleGrid[i - 1][0];
            }
        }

        // Fill in the rest of the grid.
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (obstacleGrid[i][j] == 1) {
                    obstacleGrid[i][j] = 0; // If there's an obstacle, there are no paths.
                } else {
                    // Calculate the number of paths to the current cell from the left and above.
                    obstacleGrid[i][j] = obstacleGrid[i - 1][j] + obstacleGrid[i][j - 1];
                }
            }
        }

        // The result is in the bottom-right cell of the grid.
        return obstacleGrid[m - 1][n - 1];
    }
}

