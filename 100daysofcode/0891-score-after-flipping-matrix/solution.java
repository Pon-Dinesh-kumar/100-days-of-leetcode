class Solution {
    public int matrixScore(int[][] grid) {
        
        for (int i = 0; i < grid.length; i++) {
            if (grid[i][0] == 0) {
                flipRow(grid, i);
            }
        }

        for (int j = 1; j < grid[0].length; j++) {
            int setCount = 0;
            for (int i = 0; i < grid.length; i++) {
                if (grid[i][j] == 1) {
                    setCount++;
                }
            }
            if (setCount <= grid.length / 2) {
                flipColumn(grid, j);
            }
        }

        return calculateScore(grid);
    }

    private void flipRow(int[][] grid, int rowIndex) {
        for (int j = 0; j < grid[0].length; j++) {
            grid[rowIndex][j] ^= 1;
        }
    }

    private void flipColumn(int[][] grid, int columnIndex) {
        for (int i = 0; i < grid.length; i++) {
            grid[i][columnIndex] ^= 1;
        }
    }

    private int calculateScore(int[][] grid) {
        int score = 0;
        for(int i=0; i<grid.length;i++){
            int num =0;
            for(int j=0; j<grid[0].length;j++){
                num = (num<<1)+grid[i][j];
            }
            score+=num;
        }
        return score;
    }
}

