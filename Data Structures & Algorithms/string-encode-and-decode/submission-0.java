class Solution {

    public String encode(List<String> strs) {
        StringBuilder en= new StringBuilder();
        for(String str: strs)
        {
            en.append(str.length()).append("#").append(str);
        }
        return en.toString();
    }

    public List<String> decode(String str) {
        List<String> list= new ArrayList<>();
        int i=0;
        while(i<str.length())
        {
            int start=i;
            while(str.charAt(start)!='#')
            {
                start++;
            }
            int len= Integer.valueOf(str.substring(i,start));
            i=start+1+len;
            list.add(str.substring(start+1,i));
        }
        return list;
    }
}
