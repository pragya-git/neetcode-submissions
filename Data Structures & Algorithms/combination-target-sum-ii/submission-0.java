class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        res= new ArrayList<List<Integer>>();
        Arrays.sort(candidates);
        List<Integer> subset= new ArrayList<Integer>();
        rec(candidates,target,subset,0);
        return res;
    }
    public void rec(int[] arr, int target, List<Integer> subset, int i)
    {
        // base cases
        if(target==0)
        {
            res.add(new ArrayList(subset));
            return;
        }
        if(target<0 || i>=arr.length)
        {
            return;
        }
        // recursive calls
       for(int j= i;j<arr.length;j++)
        {
            // we want to skip from second occurence not first one
            if(j>i && arr[j]==arr[j-1])
            {
                continue;
            }
            // include i in solution
            subset.add(arr[j]);
            rec(arr, target-arr[j],subset,j+1);
            // not include
            subset.remove(subset.size()-1);
        } 
        
    }
}
