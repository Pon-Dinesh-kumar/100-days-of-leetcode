class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int diff =0;

        for(int i =0; i< gain.length; i++){
            diff = diff + gain[i];
            max = Math.max(max, diff);
        }
        return max;
    }
}
