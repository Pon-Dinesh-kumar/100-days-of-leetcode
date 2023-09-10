class Solution {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        if (sx == fx && sy == fy && t == 1) {
            return false;
        }
        
        boolean xInRange = Math.abs(fx - sx) <= t;
        boolean yInRange = Math.abs(fy - sy) <= t;
        return xInRange && yInRange;
    }
}

