class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int i = 0;
        int j = 0;
        int count = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        
        while (i < s.length && j < g.length) {
            if (s[i] >= g[j]) {
                count++;
                j++;
            }
            i++;
        }

        return count;
    }
}

