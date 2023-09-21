class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n==0){
            return true;
        }
        if (flowerbed.length == 0) {
            return false;
        }
        if(flowerbed.length==1){
            if(flowerbed[0]==1){
                return false;
            }
            else{
                return true;
            }
        }
        int count = 0;

        
        if (flowerbed[0] == 0 && flowerbed[1] == 0) {
            count++;
            flowerbed[0] = 1;
        }
        
        if (flowerbed[flowerbed.length - 1] == 0 && flowerbed[flowerbed.length - 2] == 0) {
            count++;
            flowerbed[flowerbed.length - 1] = 1;
        }
        
        for (int i = 1; i < flowerbed.length - 1; i++) {
            if (flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0 && flowerbed[i] != 1) {
                flowerbed[i] = 1;
                count++;
            }
        }
        
        return count >= n;
    }
}

