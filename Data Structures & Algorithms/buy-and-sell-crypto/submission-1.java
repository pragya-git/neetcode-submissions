class Solution {
    public int maxProfit(int[] prices) {
        int left= 0;
        int right= 1;
        int maxprofit=0;
        while(right<=prices.length-1)
        {
            if(prices[left]>prices[right])
            {
                left=right;
                right=left+1;
            }
            else
            {
                int profit=prices[right]-prices[left];
                maxprofit= Math.max(profit,maxprofit);
                right++;
            }
        }
        return maxprofit;
        
    }
}
