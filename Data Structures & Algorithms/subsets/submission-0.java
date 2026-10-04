class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res= new ArrayList<>();
        List<Integer> subset= new ArrayList<>();
        rec(nums,0,subset,res);
        return res;
    }
    private void rec(int[]nums, int i, List<Integer> subset, List<List<Integer>> res)
    {
        if(i>= nums.length)
        {
            res.add(new ArrayList<>(subset));
            return;
        }
        // decision to add the nums[i]
        subset.add(nums[i]);
        rec(nums,i+1,subset,res);
        // decision to exclude nums[i]
        subset.remove(subset.size()-1);
        rec(nums,i+1,subset,res);
    }
}
