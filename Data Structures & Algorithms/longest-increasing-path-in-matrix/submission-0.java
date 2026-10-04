class Solution {
    
    int[][] dp;
    public int longestIncreasingPath(int[][] matrix) {
        int rows=matrix.length;
        int cols= matrix[0].length;
        dp= new int[rows][cols];
        int LIP=0;
        for(int[] row:dp)
        {
            Arrays.fill(row,-1);
        }
        for(int r=0;r<rows;r++)
        {
            for(int c=0;c<cols;c++)
            {
                    LIP=Math.max(LIP,dfs(r,c,matrix,Integer.MIN_VALUE));
            }
        }
        return LIP;
    }
    private int dfs(int r,int c, int[][] matrix, int preVal)
    {
        int rows=matrix.length;
        int cols= matrix[0].length;
        if(r<0||r>=rows||c<0||c>=cols||matrix[r][c]<=preVal)
        {
            return 0;
        }
        if(dp[r][c]!=-1)
        {
            return dp[r][c];
        }
        int res=1;
            res=Math.max(res,1+dfs(r+1,c,matrix,matrix[r][c]));
            res= Math.max(res,1+dfs(r-1,c,matrix,matrix[r][c]));
            res= Math.max(res,1+dfs(r,c+1,matrix,matrix[r][c]));
            res=Math.max(res,1+dfs(r,c-1,matrix,matrix[r][c]));
        return dp[r][c]=res;
    }
}
