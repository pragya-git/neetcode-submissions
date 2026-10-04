class Solution {
    private int[] dp;
    public int lengthOfLIS(int[] nums) {
        dp=new int[nums.length];
        Arrays.fill(dp,-1);
        int maxLis=1;
        for(int i= 0;i<nums.length;i++)
        {
        // calculate for lis every index and return the max one
        maxLis= Math.max(dfs(nums,i),maxLis);
        }
        return maxLis;
    }
    private int dfs(int[] nums, int i)
    {
        // to reduce the repeated work
       if(dp[i]!=-1)
       {
        return dp[i];
       }
       int lis=1;
    //    to find the lis in bottom down approach
    for(int j=i+1;j<=nums.length-1;j++)
    {
        // continue only if its a lis
        if(nums[i]<nums[j])
        {
            // calculate the lis from every possibility
            lis= Math.max(lis,1+dfs(nums,j));
        }
        
    }
    dp[i]=lis;
    return lis;
    }
}