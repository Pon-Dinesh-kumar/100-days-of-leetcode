class Solution {
    public int distributeCandies(int[] candyType) {
        Arrays.sort(candyType);
        int types = 1;
        for(int i =1; i<candyType.length; i++){
            if(candyType[i] != candyType[i-1]){
                types++;
            }
        }
        int ans = candyType.length/2;
        if(ans>types){
            return types;
        }
        else if(ans<types){
            return ans;
        }
        return types;
    }
}
