class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> arr = new ArrayList<>();
        long prev = 1;
        arr.add(1);

        for (int i = 1; i <= rowIndex; i++) {
            long curr = (prev * (rowIndex - i + 1)) / i;
            arr.add((int) curr);
            prev = curr;
        }

        return arr;
    }
}
