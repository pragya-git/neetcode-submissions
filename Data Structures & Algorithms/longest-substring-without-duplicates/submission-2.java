class Solution {
    public int lengthOfLongestSubstring(String s) {

        Set<Character> unq= new HashSet<>();
        // left window

        int left=0;
        int maxCount=0;

        // right window
        for(int right=0;right<s.length();right++)
        {
            while(unq.contains(s.charAt(right)))
            {
                // slide the window utill invalid
                unq.remove(s.charAt(left));
                left++;
            }
            // valid window processing
            unq.add(s.charAt(right));
            maxCount=Math.max(maxCount,right-left+1);
        }
       return maxCount;
    }
}
