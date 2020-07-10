class Solution {
    public int islandPerimeter(int[][] grid) {
        int result = 0;
        if(grid == null) return result;
        for(int i = 0; i< grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                if(grid[i][j] == 1){
                    result += 4;
                    // left check
                    if(j - 1 >= 0 && grid[i][j-1] == 1)result--;
                    // right check
                    if(j + 1 < grid[i].length && grid[i][j + 1] == 1) result--;
                    // up check
                    if(i - 1 >= 0 && grid[i-1][j] == 1) result--;
                    // down check 
                    if(i + 1 < grid.length && grid[i+1][j] == 1) result--;
                }
            }
        }
        return result;
    }
}