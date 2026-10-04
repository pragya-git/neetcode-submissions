class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String,List<String>> hm= new HashMap<>();
        for(String str: strs)
        {
            // covert string to char arr
            char[] arr= str.toCharArray();
            // sort array
            Arrays.sort(arr);
            // convert arr to string
            String sortedKey= String.valueOf(arr);
            // group the keys
            hm.computeIfAbsent(sortedKey,key->new ArrayList<>()).add(str);
        }
        return new ArrayList<>(hm.values());
    }
}
