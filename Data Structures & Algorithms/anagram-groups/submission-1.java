class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hm = new HashMap<>();
        List<List<String>> res= new ArrayList<>();
        for(int i=0;i<strs.length;i++)
        {
            char[] chr=strs[i].toCharArray();
            Arrays.sort(chr);
            String key=Arrays.toString(chr);
            if(!hm.containsKey(key))
            {
                hm.put(key,new ArrayList<>());
            }
         
                hm.get(key).add(strs[i]);
        }
        for(String key:hm.keySet())
        {
            res.add(hm.get(key));
        }
        return res;
    }
}