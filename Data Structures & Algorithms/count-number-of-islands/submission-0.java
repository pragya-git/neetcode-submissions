class Solution {
    // multi source bfs
    public int numIslands(char[][] grid) {
        boolean[][] visited= new boolean[grid.length][grid[0].length];
        int count=0;
        int[] r= {-1,0,1,0};
        int[] c= { 0,1,0,-1};
        Queue<int[]> q= new LinkedList<>();

        for(int i=0;i< grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]=='1' && !visited[i][j])
                {
                    count++;
                    // do bfs
                    // find the nighbours
                    q.add(new int[]{i, j});
                    visited[i][j]=true;
                    while(!q.isEmpty())
                    {
                        int[] rn= q.remove();
                        // for neighbours
                        int row= rn[0];
                        int col= rn[1];
                        for(int k=0;k<4;k++)
                        {
                            int nr=row+r[k];
                            int nc= col+c[k];
                            // checkif valid cell
                            if(nr >= 0 && nr < grid.length &&
                            nc >= 0 && nc < grid[0].length &&
                            grid[nr][nc] == '1' &&
                            !visited[nr][nc])
                                {
                                    visited[nr][nc]=true;
                                    q.add(new int[]{nr,nc});
                                }
                        }
                    }
                    
                    
                }
            }
        }

        return count;
    }
}
