class TimeMap {

    class Pair
    {
        int timestamp;
        String value;

        public Pair(int t, String v)
        {
            timestamp=t;
            value =v;
        }
    }

    // creating a node
    private Map<String, List<Pair>> map;

    public TimeMap() {
        // initializing object
        map= new HashMap<>(); 
        
    }
    
    public void set(String key, String value, int timestamp) {
        if(!map.containsKey(key))   
        {
            map.put(key,new ArrayList<>());
        }  
        map.get(key).add(new Pair(timestamp,value));   
    }
    
    public String get(String key, int timestamp) {
        if(!map.containsKey(key))
        {
            return "";
        }

        List<Pair> list= map.get(key);
        int left=0;
        int right = list.size()-1;
        String result="";
        while(left<=right)
        {
            int mid= (left+right)/2;
            if(list.get(mid).timestamp<=timestamp)
            {
                result= list.get(mid).value;
                left=mid+1;
            }
            else
            {
                right=mid-1;
            }
        }
        return result;
    }
}
