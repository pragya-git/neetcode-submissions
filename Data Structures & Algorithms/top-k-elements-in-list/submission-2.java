class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        int len=nums.length;
        Map<Integer,Integer> freqMap= new HashMap<>();
        List<Integer>[] bucket= new ArrayList[nums.length+1];
        for(int i=0;i<=len;i++)
        {
            bucket[i]= new ArrayList<>();
        }
        for(int num:nums)
        {
            // create freqmap
            freqMap.put(num, freqMap.getOrDefault(num,0)+1);
        }
        
        
        for(Map.Entry<Integer,Integer> entry: freqMap.entrySet())
        {
            int freq= entry.getValue();
            bucket[freq].add(entry.getKey());
        }
        
         // Extract the top K frequent elements
        int[] ans= new int[k];
        int counter= 0;
        for(int i=bucket.length-1;i>=0 && counter<k ;i--)
        {
            for(int number: bucket[i])
            {
            ans[counter]= number;
            counter++;
            }
        }
        return ans;
    }
}
