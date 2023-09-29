class Solution {
    public boolean isSameAfterReversals(int num) {
        long ans = 0;
        long ans2 = 0;
        long y = (long) num;
        boolean flag = false;

        if (y < 0) {
            flag = true;
            y = -y; 
        }
        while (y > 0) {
            ans = ans * 10 + y % 10;
            y = y / 10;
        }
        if (flag) {
            ans = -ans;
        }

        y = ans;

        if (y < 0) {
            flag = true;
            y = -y; 
        }
        while (y > 0) {
            ans2 = ans2 * 10 + y % 10;
            y = y / 10;
        }
        if (flag) {
            ans2 = -ans2;
        }
        if(ans2 == (long)num){
            return true;
        }
        return false;
    }
}
