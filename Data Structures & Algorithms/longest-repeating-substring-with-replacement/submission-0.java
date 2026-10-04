class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character,Integer> freqmap= new HashMap<>();
        int left=0;
        int ans= 0;
        int maxfreq=0;
        for(int right=0;right<s.length();right++)
        {
            freqmap.put(s.charAt(right), freqmap.getOrDefault(s.charAt(right),0)+1);
            maxfreq=Math.max(maxfreq,freqmap.get(s.charAt(right)));
            // get the most freq char, invlaid window is not freq char
            while((right-left+1)-maxfreq>k)
            {
                freqmap.put(s.charAt(left), freqmap.get(s.charAt(left)) - 1);
                left++;
            }
                ans=Math.max(ans, right-left+1);
    
        }
        return ans;
    }
}
