class Solution {
    int[][] memo;
    public int change(int amount, int[] coins) {
        Arrays.sort(coins);
        memo= new int[coins.length+1][amount+1];
        for(int[] row:memo)
        {
            Arrays.fill(row,-1);
        }
        
        return dfs(amount,coins,0,memo);
    }
    private int dfs(int amount, int[] coins, int i, int[][] memo)
    {
        int res=0;
        if(amount==0)
        {
            return 1;
        }
        if(i>=coins.length)
        {
            return 0;
        }
        if(memo[i][amount]!=-1)
        {
            return memo[i][amount];
        }
        if(amount>= coins[i])
        {
        // to include
        res= dfs(amount,coins,i+1,memo);
        // to exclude
        res=res+dfs(amount-coins[i],coins,i,memo);
        }
        memo[i][amount]= res;
        return res;
    }
}
