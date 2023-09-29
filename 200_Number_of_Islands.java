class Pair{
    int first;
    int second;
    public Pair(int first, int second){
        this.first = first;
        this.second = second;
    }
}
class Solution {
     public void dfs(int row, int col, int[][] mat, boolean[][] vis, int n, int m){
        vis[row][col] = true;
        for(int delrow = -1; delrow <= 1; delrow++){
            for(int delcol = -1; delcol <= 1; delcol++){
                int nrow = row + delrow;
                int ncol = col + delcol;

                if(nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && vis[nrow][ncol] == false && mat[nrow][ncol] == 1)
                {
                    dfs(nrow, ncol, mat, vis, n, m);
                }
            }
        }
    }
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int cnt = 0;
        boolean[][] vis = new boolean[n][m];
        
        for(int row = 0; row < n; row++){
            for(int col = 0; col < m; col++){
                if(!vis[row][col] && grid[row][col] == '1'){
                    cnt++;
                    dfs(row, col, vis, grid, n ,m);
                }
            }
        }
        return cnt;
    }
}
