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
        int[] result = new int[k];
    int index = 0;
    for (int i = nums.length; i >= 0 && index < k; i--) {
        for (int num : bucket[i]) {
            result[index++] = num;
            if (index == k) {
                break;
            }
        }
    }
        return result;
    }
}
