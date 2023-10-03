/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index);
 *     public int length();
 * }
 */

class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n = mountainArr.length();
        int start = 0;
        int end = n - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            int midValue = mountainArr.get(mid);
            int midNextValue = mountainArr.get(mid + 1);

            if (midValue < midNextValue) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        int peakIndex = start;

        start = 0;
        end = peakIndex;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int midValue = mountainArr.get(mid);

            if (midValue == target) {
                return mid;
            } else if (midValue < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        start = peakIndex;
        end = n - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int midValue = mountainArr.get(mid);

            if (midValue == target) {
                return mid;
            } else if (midValue < target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1; 
    }
}

