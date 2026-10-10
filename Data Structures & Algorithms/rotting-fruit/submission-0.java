class Solution {
    public int orangesRotting(int[][] grid) {
          class Pair {
        int r, c, time;

        Pair(int r, int c, int time) {
            this.r = r;
            this.c = c;
            this.time = time;
        }
    }
        int n=grid.length;
        int m=grid[0].length;
        Queue<Pair> q=new LinkedList<>();

        int[][] vis =new int[n][m];
        int cntfresh=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==2)
                {
                    q.add(new Pair(i,j,0));
                    vis[i][j]=2;
                }
                else{
                    vis[i][j]=0;
                }
                if(grid[i][j]==1) cntfresh++;
            }
        }
    int time=0;
    int dr[]={-1,1,0,0};
    int dc[]={0,0,-1,1};
    while(!q.isEmpty())
    {
    Pair p=q.poll();
    int r=p.r;
    int c=p.c;
    int t=p.time;
    time=Math.max(time,t);
    for(int k=0;k<4;k++)
    {
        int nr=r+dr[k];
        int nc=c+dc[k];
        if (nr >= 0 && nc >= 0 &&
                    nr < n && nc < m &&
                    grid[nr][nc] == 1 &&
                    vis[nr][nc] == 0) {

                    q.add(new Pair(nr, nc, t + 1));
                    vis[nr][nc] = 2;
                    cntfresh--;
                }}
    }
        return cntfresh == 0 ? time : -1;
    }
}
