public class Solution {
    private int[][] memo;
    private int totalsum;
    public int findTargetSumWays(int[] nums, int target) {
        totalsum=0;
         for(int num:nums)
        {
            totalsum=totalsum+num;
        }
        memo= new int[nums.length][2*totalsum+1];
        for(int[] row:memo)
        {
            Arrays.fill(row, Integer.MIN_VALUE);
        }
        return backtrack(0, 0, nums, target);
    }

    private int backtrack(int i, int total, int[] nums, int target) {
        if (i == nums.length) {
            return total == target ? 1 : 0;
        }
        if(memo[i][total+totalsum]!=Integer.MIN_VALUE)
        {
            return memo[i][total+totalsum];
        }
        memo[i][total+totalsum]=
         backtrack(i + 1, total + nums[i], nums, target) +
               backtrack(i + 1, total - nums[i], nums, target);
        
        return memo[i][total+totalsum];
    }
}