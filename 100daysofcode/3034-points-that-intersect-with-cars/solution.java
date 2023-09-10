class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
    int lowestStart = Integer.MAX_VALUE;
    int highestEnd = Integer.MIN_VALUE;

    for (List<Integer> car : nums) {
        int starti = car.get(0);
        int endi = car.get(1);

        lowestStart = Math.min(lowestStart, starti);
        highestEnd = Math.max(highestEnd, endi);
    }

    boolean[] isCovered = new boolean[highestEnd - lowestStart + 1];

    for (List<Integer> car : nums) {
        int starti = car.get(0);
        int endi = car.get(1);

        for (int i = starti; i <= endi; i++) {
            isCovered[i - lowestStart] = true;
        }
    }

    int count = 0;
    for (boolean covered : isCovered) {
        if (covered) {
            count++;
        }
    }

    return count;
}

}
