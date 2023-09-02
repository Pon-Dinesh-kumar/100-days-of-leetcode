class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
         int len = nums1.length + nums2.length;
         int[] arr = new int[len];

       
         for (int i = 0; i < nums1.length; i++) {
            arr[i] = nums1[i];
        }

       
         for (int i = 0; i < nums2.length; i++) {
            arr[nums1.length + i] = nums2[i];
        }
         Arrays.sort(arr);
        if (len % 2 == 1) {
            return arr[len / 2];
        } else {
            int middle1 = arr[(len - 1) / 2];
            int middle2 = arr[len / 2];
            return (double) (middle1 + middle2) / 2.0;
        }

        

        
        
    }
}
