class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> unq= new HashSet<>();
        // left window
        int left=0;
        int maxcount=0;
        // right window
        for(int right=0;right<s.length();right++)
        {
            // invalid window
            while(unq.contains(s.charAt(right)))
            {
                unq.remove(s.charAt(left));
                left++;
            }
            // logical processing
            unq.add(s.charAt(right));
            maxcount= Math.max(maxcount, right-left+1);
        }
        return maxcount;
    }
}
