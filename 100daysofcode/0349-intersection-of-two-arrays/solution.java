import java.util.ArrayList;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] arr = new int[1001];
        ArrayList<Integer> ans = new ArrayList<>();

        for (int num : nums1) {
            if (num >= 0 && num <= 1000 && arr[num] == 0) {
                arr[num]++;
            }
        }

        for (int num : nums2) {
            if (num >= 0 && num <= 1000 && arr[num] == 1) {
                ans.add(num);
                arr[num]++;
            }
        }

        int[] intersectionArray = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            intersectionArray[i] = ans.get(i);
        }

        return intersectionArray;
    }
}

