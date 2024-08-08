class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {

        int notVisited = rows * cols;
        int left = 2;
        int right = 1;
        int up = 2;
        int down = 1;

        int[][] visitedOrder = new int[notVisited][2];
        int index = 0;

        int val = checkAndAdd(visitedOrder, rows, cols, rStart, cStart, index);
        index += val;
        notVisited -= val;

        while (notVisited > 0) {
            
            for (int i = 0; i < right; i++) {
                cStart++;
                val = checkAndAdd(visitedOrder, rows, cols, rStart, cStart, index);
                index += val;
                notVisited -= val;
            }
            right += 2;

            for (int i = 0; i < down; i++) {
                rStart++;
                val = checkAndAdd(visitedOrder, rows, cols, rStart, cStart, index);
                index += val;
                notVisited -= val;
            }
            down += 2;

            for (int i = 0; i < left; i++) {
                cStart--;
                val = checkAndAdd(visitedOrder, rows, cols, rStart, cStart, index);
                index += val;
                notVisited -= val;
            }
            left += 2;

            for (int i = 0; i < up; i++) {
                rStart--;
                val = checkAndAdd(visitedOrder, rows, cols, rStart, cStart, index);
                index += val;
                notVisited -= val;
            }
            up += 2;
        }

        return visitedOrder;
    }

    public int checkAndAdd(int[][] visitedOrder, int rows, int cols, int rStart, int cStart, int index) {
        if (rStart >= 0 && rStart < rows && cStart >= 0 && cStart < cols && index < rows*cols) {
            visitedOrder[index][0] = rStart;
            visitedOrder[index][1] = cStart;
            return 1;
        }
        return 0;
    }
}
