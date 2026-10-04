class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> hs= new HashSet<Integer>();
        int curr;
        int len=1;
        int Maxlen=0;
        for(int i=0;i<nums.length;i++)
        {
            hs.add(nums[i]);
        }

        for(int i=0;i<nums.length;i++)
        {
             if(!hs.contains(nums[i]-1))
            {
                len=1;
                curr= nums[i];
                while(hs.contains(curr+1))
                {
                    curr++;
                    len++;
                }
            }
            Maxlen= Math.max(Maxlen,len);
        }
       
        
        return Maxlen;
    }
}
