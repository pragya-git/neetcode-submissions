class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int windowsize= s1.length();
        if(s2.length()<windowsize) return false;
       Map<Character,Integer> f1= new HashMap<>();
       Map<Character,Integer> f2= new HashMap<>();

       for(int i=0;i<windowsize;i++)
       {
        f1.put(s1.charAt(i),f1.getOrDefault(s1.charAt(i),0)+1);
        f2.put(s2.charAt(i),f2.getOrDefault(s2.charAt(i),0)+1);
       }
       
        if (f1.equals(f2)) return true;
        
        for(int right=windowsize;right<s2.length();right++)
        {
            if(f1.equals(f2)) return true;
            
            char add=s2.charAt(right);
            f2.put(add,f2.getOrDefault(add,0)+1);
            
            char sub=s2.charAt(right-windowsize);
            f2.put(sub,f2.get(sub)-1);
            
            if(f2.get(sub)==0)
            f2.remove(sub);
            
            if(f1.equals(f2)) return true;
        }
        return false;
    }
}
