class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int numRows = mat.length;
        int numCols = mat[0].length;

        if (numRows * numCols != r * c) {
            return mat;
        }

        int[][] reshapedMat = new int[r][c];
        int sourceRow = 0, sourceCol = 0;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                reshapedMat[i][j] = mat[sourceRow][sourceCol];
                sourceCol++;
                if (sourceCol == numCols) {
                    sourceRow++;
                    sourceCol = 0;
                }
            }
        }

        return reshapedMat;
    }
}

