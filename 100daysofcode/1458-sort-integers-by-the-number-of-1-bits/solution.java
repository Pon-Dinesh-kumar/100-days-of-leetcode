class Solution {
    public int[] sortByBits(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num:arr){
            int count =0;
            int temp = num;
            while(temp>0){
                int temp1 = temp & 1;
                if(temp1==1){
                    count++;
                }
                temp = temp>>1;
            }
            map.put(num, count);
        }

        Arrays.sort(arr);

        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (map.get(arr[j]) > map.get(arr[j + 1])) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        return arr;
    }
}
