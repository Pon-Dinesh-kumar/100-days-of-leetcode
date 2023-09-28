class Solution {
    public int maximumWealth(int[][] accounts) {
        if (accounts.length == 0 || accounts[0].length == 0) {
            return 0;
        }
        int max = 0;
        for (int[] account : accounts) {
            int maxrow = 0;
            for (int balance : account) {
                maxrow += balance;
            }
            max = Math.max(max, maxrow);
        }
        return max;
    }
}

