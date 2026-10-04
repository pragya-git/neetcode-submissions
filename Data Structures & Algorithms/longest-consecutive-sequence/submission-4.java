class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set= new HashSet<Integer>();
        int length=0;
        for(int num:nums)
        {
            set.add(num);
        }
        for(int num:nums)
        {
            if(!set.contains(num-1))
            {
                int curr=num;
                int count=0;
                while(set.contains(curr))
                {
                set.remove(num);
                curr++;
                count++;
                }
                length=Math.max(count,length);
            }
        }
        return length;
    }
}
