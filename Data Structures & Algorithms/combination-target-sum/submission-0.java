class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        res=new ArrayList<List<Integer>>();
       List<Integer> subset= new ArrayList();
       rec(nums,target,subset,0);
        return res;
    }
    public void rec( int[]nums, int target,List<Integer> subset, int i)
    {
        // termination condition
        if(target==0)
        {
            res.add(new ArrayList(subset));
                return;
        }
        if(target<0 || i>=nums.length)
        {
            return;
        }
        // include element
        subset.add(nums[i]);
        rec(nums,target-nums[i],subset,i);
        
        // exclude target
        subset.remove(subset.size()-1);
        rec(nums,target,subset,i+1);
    }
}
