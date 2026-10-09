class Solution {
    public int maxAreaOfIsland(int[][] grid) {
           
          int maxarea=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==1)
                {
                    int area=dfs(grid, i,j);
                    maxarea=Math.max(maxarea,area);
                }
            }
        }
        return maxarea;
    }
    private int dfs(int grid[][],int r,int c){
        if(r<0 || c<0 || r>=grid.length||c>=grid[0].length || grid[r][c]==0){
            return 0;
        }
        int area=1;
        grid[r][c]=0;
        area +=dfs(grid,r+1,c);
        area +=dfs(grid,r-1,c);
        area +=dfs(grid,r,c+1);
        area +=dfs(grid,r,c-1); 
        return area;
    }
}
