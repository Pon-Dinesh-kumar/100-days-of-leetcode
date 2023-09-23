import java.util.Arrays;

class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;
        Arrays.sort(hours);
        for (int i = 0; i < hours.length; i++) {
            if (hours[i] < target) {
                count++;
            } else {
                break;
            }
        }
        return hours.length - count;
    }
}

