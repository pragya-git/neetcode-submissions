class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        res= new ArrayList<>();
        Arrays.sort(nums);
        List<Integer> subset= new ArrayList<>();
        rec(nums, subset, 0);
        return res;
    }
    public void rec(int[] nums, List<Integer> subset, int index)
    {
            res.add(new ArrayList(subset));
        // recursive def
        for(int j= index;j<nums.length;j++)
        {
            if(j>index && nums[j]==nums[j-1])
            {
                continue;
            }
            // to include
            subset.add(nums[j]);
            rec(nums,subset,j+1);
            // remove for the fresh start
            subset.remove(subset.size()-1);
        }
    }
}
