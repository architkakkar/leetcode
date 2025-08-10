class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int s = x;
        int e = x + k - 1;
        while (s < e) {
            int j = y;
            int terminate = j+k;
            
            while (j < terminate) {
                int temp = grid[s][j];
                grid[s][j] = grid[e][j];
                grid[e][j] = temp;

                j++;
            }
            s++;
            e--;
        }

        return grid;
    }
}