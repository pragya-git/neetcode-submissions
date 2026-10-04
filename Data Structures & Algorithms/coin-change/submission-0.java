class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp= new int[amount+1];
        Arrays.fill(dp,amount+1);

        dp[0]=0;

        for(int curAmount=1;curAmount<=amount;curAmount++)
        {
            for(int curCoin=0;curCoin<coins.length;curCoin++)
            {
                if(coins[curCoin]<=curAmount)
                {
                    dp[curAmount]=Math.min(dp[curAmount],dp[curAmount-coins[curCoin]]+1);
                }
            }
        }
        return dp[amount]>amount?-1:dp[amount];
    }
}
