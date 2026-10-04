public class Solution {
    private int[][] memo;
    private int sum;
    public int findTargetSumWays(int[] nums, int target) {
        sum=0;
         for(int num:nums)
        {
            sum=sum+num;
        }
        memo= new int[nums.length][2*sum+1];
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
        if(memo[i][total+sum]!=Integer.MIN_VALUE)
        {
            return memo[i][total+sum];
        }
        memo[i][total+sum]=
         backtrack(i + 1, total + nums[i], nums, target) +
               backtrack(i + 1, total - nums[i], nums, target);
        
        return memo[i][total+sum];
    }
}