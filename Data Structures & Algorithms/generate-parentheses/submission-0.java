class Solution {
    List<String> res;
    public List<String> generateParenthesis(int n) {
        res= new ArrayList<>();
        List<Character> subset= new ArrayList<>();
        backtrack(n, subset,0,0 );
        return res;
    }
    public void backtrack(int n, List<Character> subset, int open, int closed)
    {
        Stack stk= new Stack<Integer>();
        // base case
        if(open==closed && open==n)
        {
            String str="";
            for(Character ch:subset)
            {
                str=str+ch;
            }
            res.add(str);
        }
        // backtrack logic
        if(open<n)
        {
            subset.add('(');
            backtrack(n, subset, open+1,closed);
            // to expolre other choices
            subset.remove(subset.size()-1);
        }
        if(closed<open)
        {
            subset.add(')');
            backtrack(n,subset,open,closed+1);
            subset.remove(subset.size()-1);
        }
    }
}
