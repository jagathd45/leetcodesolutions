class Solution {
    public int numEnclaves(int[][] grid) {
        Queue<Pair>q = new LinkedList<>();
        int m = grid.length;
        int n = grid[0].length;
        int[][] vis = new int [m][n];
        for(int i=0;i<n;i++)
        {
            if(grid[0][i] == 1)
            {
                q.add(new Pair(0,i));
                vis[0][i] = 1;
            }
            if(grid[m-1][i] == 1)
            {
                q.add(new Pair(m-1,i));
                vis[m-1][i] = 1;
            }
        }
        for(int i=0;i<m;i++)
        {
            if(grid[i][0] == 1 &&  vis[i][0] == 0)
            {
                q.add(new Pair(i,0));
                vis[i][0] = 1;
            }
            if(grid[i][n-1] == 1 && vis[i][n-1] == 0
            )
            {
                q.add(new Pair(i,n-1));
                vis[i][n-1] = 1;
            }
        }
        int[] drow = {0,1,0,-1};
        int[] dcol = {1,0,-1,0};
        while(!q.isEmpty())
        {
            int r = q.peek().row;
            int c = q.peek().col;
            q.poll();
            for(int i=0;i<4;i++)
            {
                int nrow = r + drow[i];
                int ncol = c + dcol[i];
                if(nrow>=0 && nrow<m && ncol>=0 && ncol<n && vis[nrow][ncol]==0 && grid[nrow][ncol] == 1)
                {
                    q.offer(new Pair(nrow,ncol));
                    vis[nrow][ncol]=1;
                }
            }
        }
        int ans = 0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j] == 1 && vis[i][j] == 0)
                {
                    ans++;
                }
            }
        }
        return ans;
    }
}
class Pair
{
    int row;
    int col;
    Pair(int _row, int _col)
    {
        this.row = _row;
        this.col = _col;
    }
}