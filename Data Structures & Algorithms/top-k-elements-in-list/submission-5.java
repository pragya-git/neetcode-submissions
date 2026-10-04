class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm= new HashMap<>();
        int len=nums.length;
        List<Integer>[] bucket= new ArrayList[len+1];
        int[] ans= new int[k];
        for(int i=0;i<=len;i++)
        {
            bucket[i]= new ArrayList<>();
        }
       for(int i=0;i<nums.length;i++)
       {
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
       }
       for(Map.Entry<Integer,Integer> entry : hm.entrySet())
       {
            int freq= entry.getValue();
            bucket[freq].add(entry.getKey());
       }
       int counter=0;
        // fetching from bucket sort
        for(int j= bucket.length-1;j>=0 && counter<k;j--)
        {
           for(int num:bucket[j])
           {
            ans[counter]=num;
            counter++;
           }
        }
        return ans;
    }
}
