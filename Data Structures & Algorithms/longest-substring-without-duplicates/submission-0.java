class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> unique= new HashSet<>();
        int left=0;
        int maxcount=0;
        for(int right=0;right<s.length();right++)
        {
            while(unique.contains(s.charAt(right)))
            {
                unique.remove((s.charAt(left)));
                left++;
            }

            unique.add(s.charAt(right));
            maxcount=Math.max(right-left+1,maxcount);
           
        }
        return maxcount;
    }
}
