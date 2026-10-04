class Solution {
    public List<List<Integer>> permute(int[] nums) {
        boolean[] used= new boolean[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            used[i]=false;
        }
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> cur= new ArrayList<>();
        permute(nums,0, ans, cur, used);
        return ans;
    }
    void permute(int[] nums, int index, List<List<Integer>> ans, List<Integer> cur , boolean[] used)
    {
        // base case
        if(index== nums.length)
        {
            ans.add(new ArrayList<>(cur));
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(used[i]!=true)
            {
                used[i]=true;
                cur.add(nums[i]);
                permute(nums, index+1, ans,cur, used);
            // remove ans backtrack
                cur.remove(cur.size()-1);
                used[i]= false;
            }
        }
        
        
    }
}
