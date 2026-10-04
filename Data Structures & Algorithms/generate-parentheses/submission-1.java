class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans= new ArrayList<>();
        List<Character> str= new ArrayList<>();
        backtrack(n, str, 0,0, ans);
        return ans;
    }
    void backtrack(int n,List<Character> subset,int opening, int closing, List<String> ans )
    {
        // base case
        if(subset.size()==n*2)
        {
            String str="";
            for(int i=0;i<subset.size();i++)
            {
                str=str+subset.get(i);
            }
             ans.add(str);
             return;
        }
        // s1 to add (
        if(opening<n)
        {
            subset.add('(');
            backtrack(n, subset, opening+1, closing, ans);
            subset.remove(subset.size()-1);
        }
        // s2 to add )
        if(closing<opening)
        {
            subset.add(')');
            backtrack(n, subset, opening, closing+1, ans);
            subset.remove(subset.size()-1);
        }
    }
}
