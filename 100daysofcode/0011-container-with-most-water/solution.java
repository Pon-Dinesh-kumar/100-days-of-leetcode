class Solution {
    public int maxArea(int[] height) {
        int len = height.length;
        int max = height[len - 1];
        int min = height[0];
        int i = 0, j = len - 1;
        int area = 0;

        while (i < j) {
            int currentMin = Math.min(height[i], height[j]);
            area = Math.max(area, currentMin * (j - i));

            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }

        return area;
    }
}

