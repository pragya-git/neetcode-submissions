class Solution {
    public int characterReplacement(String s, int k) {
     int res=0;
     HashSet<Character> charSet= new HashSet<>();
     for(char c: s.toCharArray())
     {
        charSet.add(c);
     }
     for(char c: charSet)
     {
        int count=0;
        int left=0;
        for(int right=0;right<s.length();right++)
        {
            // valid window
            if(s.charAt(right)==c)
            {
                count++;
            } 
            // invalid window
            while((right-left+1)-count>k)
            {
                if(s.charAt(left)==c)
                {
                    count--;
                }
                left++;
            }
            res= Math.max(res,right-left+1) ;
        }
     }
     return res;
    }
}
