class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> cur= new ArrayList<>();
        backtrack(nums, target,0, ans,cur);
        return ans;
    }
    void backtrack(int[] nums, int target, int index, List<List<Integer>> ans, List<Integer> cur)
    {
        // base case
        if(target<0||index==nums.length)
        {
            return;
        }
        if(target==0)
        {
            ans.add(new ArrayList<>(cur));
            return;
        }
        // to choose
        cur.add(nums[index]);
       backtrack(nums, target-nums[index],index,ans,cur); 
    //    backtrack
        cur.remove(cur.size()-1);
    // to not choose
        backtrack(nums,target,index+1,ans,cur);
    }
}
