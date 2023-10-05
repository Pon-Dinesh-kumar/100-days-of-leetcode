class Solution {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            int target = arr[i] * 2;
            if(target < 0){
                if(binarySearch(arr, target, 0, arr.length - 1)){
                    return true;
                }
            }
            else{
                if(binarySearch(arr, target, i+1, arr.length - 1)){
                    return true;
                }
            }
        }

        return false;
    }

    private boolean binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }
}

