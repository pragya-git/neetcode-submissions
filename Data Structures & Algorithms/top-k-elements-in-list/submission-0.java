class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap= new HashMap<>();
         for(int i=0;i<nums.length;i++)
        {
            freqMap.put(nums[i],freqMap.getOrDefault(nums[i],0)+1);
        }
        List<Integer>[] buckets = new List[nums.length + 1];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            int num = entry.getKey();
            int frequency = entry.getValue();
            buckets[frequency].add(num);
        }
          List<Integer> result = new ArrayList<>();
        for (int i = buckets.length - 1; i >= 0 && result.size() < k; i--) {
            if (!buckets[i].isEmpty()) {
                result.addAll(buckets[i]);
            }
        }
        int[] topKFrequent = new int[k];
        for (int i = 0; i < k; i++) {
            topKFrequent[i] = result.get(i);
        }

        return topKFrequent;
    }
}
