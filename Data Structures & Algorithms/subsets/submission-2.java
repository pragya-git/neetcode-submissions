class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n=nums.length;
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> cur= new ArrayList<>();
        backtrack(nums, 0, ans,cur);
        return ans;
    }
    void backtrack(int[] nums, int index, List<List<Integer>> ans,List<Integer> cur)
    {
        // base case
        if(index==nums.length)
        {
            ans.add(new ArrayList<>(cur));
            return;
        }
        // state 1 to take
            cur.add(nums[index]);
            backtrack(nums, index+1, ans,cur);
        // real backtracking
            cur.remove(cur.size()-1);  
        // state 2 not take
            backtrack(nums, index+1,ans,cur);


    }
}
