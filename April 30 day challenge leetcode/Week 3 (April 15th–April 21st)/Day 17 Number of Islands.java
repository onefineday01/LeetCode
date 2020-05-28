class Solution {
    public int numIslands(char[][] grid) {
        if(grid == null || grid.length == 0)
            return 0;
        int n = grid.length;
        int m = grid[0].length;
        boolean visited[][] = new boolean[n][m];
        int count = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(visited[i][j] || grid[i][j] == '0')
                    continue;
                count++;
                dfs(i, j, grid, visited, n, m);
            }
        }
        return count;
    }
    void dfs(int i, int j, char[][] grid, boolean[][] visited, int n, int m){
        if(i<0 || i>=n || j<0 || j>=m || visited[i][j])
            return;
        if(grid[i][j] == '0'){
            visited[i][j] = true;
            return;
        }
        visited[i][j] = true;
        dfs(i+1, j, grid, visited, n, m);
        dfs(i-1, j, grid, visited, n, m);
        dfs(i, j+1, grid, visited, n, m);
        dfs(i, j-1, grid, visited, n, m);
    }
}