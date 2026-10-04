class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> numSet= new HashSet<Integer>();
        for(int i: nums)
        {   
            numSet.add(i);
        }
        if(nums.length== numSet.size())
        {
            return false;
        }
        return true;
    }
}