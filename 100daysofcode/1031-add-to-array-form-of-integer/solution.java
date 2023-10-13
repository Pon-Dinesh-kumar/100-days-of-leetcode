class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> arr = new ArrayList<>();
        int i = 0;
        
        // Traverse the number array in reverse and add to ArrayList
        for (int j = num.length - 1; j >= 0; j--) {
            int sum = num[j] + (k % 10) + i;
            arr.add(sum % 10);
            i = sum / 10;
            k /= 10;
        }
        
        // Continue adding the remaining digits of k
        while (k > 0) {
            int sum = (k % 10) + i;
            arr.add(sum % 10);
            i = sum / 10;
            k /= 10;
        }
        
        // Add any remaining carry
        if (i > 0) {
            arr.add(i);
        }
        
        // Reverse the ArrayList and return it
        Collections.reverse(arr);
        
        return arr;
    }
}

