class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
    for (int row = 0; row < image.length; row++) {
        int start = 0;
        int end = image[row].length - 1;
        
        while (start <= end) {
            int temp = (image[row][start] + 1) % 2;
            image[row][start] = (image[row][end] + 1) % 2;
            image[row][end] = temp;
            
            start++;
            end--;
        }
    }
    
    return image;
}

}
