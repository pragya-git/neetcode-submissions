class Solution {
    public int characterReplacement(String s, int k) {
       Map<Character,Integer> freqMap=new HashMap<>();
       int left=0;
       int ans=0;
       int maxFreq=0;
       for(int right=0;right<s.length();right++)
       {
        freqMap.put(s.charAt(right),freqMap.getOrDefault(s.charAt(right),0)+1);
        maxFreq= Math.max(maxFreq,freqMap.get(s.charAt(right)));

        while(right-left+1-maxFreq>k)
        {
            freqMap.put(s.charAt(left),freqMap.get(s.charAt(left))-1);
            left++;
        }
        ans=Math.max(ans,right-left+1);
       }
       return ans;
    }
}
