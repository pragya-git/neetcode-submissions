class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap= new HashMap<>(); 
        int[] ans= new int[2];
        for(int i=0;i<nums.length;i++)
        {
            int complement= target-nums[i];
           if(numMap.containsKey(complement))
           {
                ans[0]=numMap.get(complement);
                ans[1]= i;
           }
            numMap.put(nums[i],i);
        }
        return ans; 
    }
}
