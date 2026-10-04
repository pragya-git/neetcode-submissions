class Solution {
    List<List<String>> res;
    public List<List<String>> partition(String s) {
        res= new ArrayList<>();
        List<String> subset= new ArrayList<>();
        rec(0,s,subset);
        return res;
    }
     public void rec( int i,String s,List<String> subset)
     {
        // termination condition
        if(i>=s.length())
        {
            res.add(new ArrayList(subset));
            return;
        }
        // backtrack condition
        for(int j= i;j< s.length();j++)
        {
            if(isPalin(s,i,j))
        {
            subset.add(s.substring(i,j+1));
            rec(j+1,s,subset);
            subset.remove(subset.size()-1);
        }
    }
     }
     public boolean isPalin(String s, int l, int r)
     {
        while(l<=r)
        {
            if(s.charAt(l)!=s.charAt(r))
            {
                return false;
            }
            l++;
            r--;
        }
        return true;
     }
}
