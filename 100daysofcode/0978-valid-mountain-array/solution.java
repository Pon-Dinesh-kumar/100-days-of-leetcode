class Solution {
    public boolean validMountainArray(int[] arr) {
        int n = arr.length;
        
        if (n < 3) {
            return false; // A mountain array must have at least 3 elements.
        }

        int i = 0;

        // Ascend the mountain from the left side.
        while (i < n - 1 && arr[i] < arr[i + 1]) {
            i++;
        }

        // Peak can't be the first or the last element.
        if (i == 0 || i == n - 1) {
            return false;
        }

        // Descend the mountain from the right side.
        while (i < n - 1 && arr[i] > arr[i + 1]) {
            i++;
        }

        return i == n - 1;
    }
}

