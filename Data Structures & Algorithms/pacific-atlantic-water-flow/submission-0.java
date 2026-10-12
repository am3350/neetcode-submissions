class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
                 List<List<Integer>> ans=new ArrayList<>();
         if(heights==null || heights.length==0 || heights[0].length==0)
         {
            return ans;
         }
         int m=heights.length;
         int n=heights[0].length;
         boolean[][] pacific=new boolean[m][n];
         boolean[][] atlantic=new boolean[m][n];
         //pacific
         for(int i=0;i<m;i++)
         {
            dfs(heights,i,0,pacific);
         }
         for(int j=0;j<n;j++)
         {
            dfs(heights,0,j,pacific);
         }
         //atlantic
          for(int i=0;i<m;i++)
         {
            dfs(heights,i,n-1,atlantic);
         }
         for(int j=0;j<n;j++)
         {
            dfs(heights,m-1,j,atlantic);
         }
         //reachable from both ends
         for(int i=0;i<m;i++)
         {
            for(int j=0;j<n;j++)
            {
                if(pacific[i][j] && atlantic[i][j])
                {
                    ans.add(Arrays.asList(i,j));
                }
            }
         }
         return ans;
    }
    private void dfs(int heights[][],int r,int c,boolean[][] visited )
    {
        if(r<0 ||c<0 ||r>=heights.length || c>=heights[0].length || visited[r][c])
        {
            return;
        }
        int dr[]={-1,1,0,0};
        int dc[]={0,0,-1,1};
        visited[r][c] = true;
        for(int k=0;k<4;k++)
        {
            int nr=dr[k]+r;
            int nc=dc[k]+c;
            if(nr>=0 && nc>=0 && nr<heights.length && nc<heights[0].length && !visited[nr][nc] && heights[nr][nc]>=heights[r][c]){
                dfs(heights,nr,nc,visited);
            }
        }
    }
}
