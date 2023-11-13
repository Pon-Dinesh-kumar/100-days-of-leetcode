class Solution {
    public int lastStoneWeight(int[] stones) {

        Arrays.sort(stones);
        int len = stones.length-1;

        if(len==0){
            return stones[0];
        }

        while(stones[len-1]!=0){
            stones[len] = stones[len] - stones[len-1];
            stones[len-1] = 0;
            Arrays.sort(stones);
        }

        return stones[len];
        
    }
}
