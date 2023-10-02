class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] soldiers = new int[mat.length];
        for(int i = 0; i < mat.length; i++){
            soldiers[i] = findSoldiersNum(mat[i]);
        }
        int[]kWeakest = new int[k];
        for(int i = 0; i < k ; i++){
            kWeakest[i] = findMin(soldiers);
        }
        return kWeakest;
    }

    private int findSoldiersNum(int[] arr){
        int s = 0;
        int e = arr.length - 1;
        while(s <= e){
            int mid = s + (e - s) / 2;
            if(arr[mid] > 0){
                s = mid + 1;
            }else{
                e = mid - 1;
            }
        }
        return s;
    }

    private int findMin(int[] arr){
        int minValue = Integer.MAX_VALUE;
        int minIdx = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] >= 0 && arr[i] < minValue){
                minIdx = i;
                minValue = arr[i];
            }
        }
        arr[minIdx] = -1;
        return minIdx;
    }
}
