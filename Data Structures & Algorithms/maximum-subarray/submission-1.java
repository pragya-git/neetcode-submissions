class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum=nums[0];
        int curSum=0;
        for(int num:nums)
        {
            // resets subArray
            if(curSum<0)
            {
                curSum=0;
            }
            curSum=curSum+num;
            maxSum= Math.max(maxSum,curSum);
        }
        return maxSum;
    }
}
