class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int max = 0;
        int[] c = new int[128];
        for (int i = 0, j = 0; j < n; j++) {
            i = Math.max(c[s.charAt(j)], i);
            max = Math.max(max, j - i + 1);
            c[s.charAt(j)] = j + 1;
        }

        return max;
    }
}
