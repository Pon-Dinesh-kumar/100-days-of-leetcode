class Solution {
    public int islandPerimeter(int[][] grid) {
        int no1 = 0;
        int shared = 0;

        for (int row = 0; row < grid.length; row++) { 
            for (int col = 0; col < grid[row].length; col++) {
                 if(grid[row][col] == 1){
                     no1++;
                     if(row>0){
                     if(grid[row-1][col]==1){
                         shared++;
                     }}
                     if(row<grid.length-1){
                     if(grid[row+1][col]==1){
                         shared++;
                     }}
                     if(col>0){
                     if(grid[row][col-1]==1){
                         shared++;
                     }}
                     if(col <grid[row].length-1){
                     if(grid[row][col+1]==1){
                         shared++;
                     }}
                 }
            } 
        }

        int ans = no1*4 - shared;
        return ans;


        
    }
}
