class Solution {
    public boolean checkInclusion(String s1, String s2) {
       if(s1.length()>s2.length()) 
       {return false;}
       else
       {
         int[] count1= new int[26];
         int[] count2 =new int[26];
         int l=0;
         // INITIAL FREQMAP 
         for(int i=0;i<s1.length();i++)
         {
            count1[s1.charAt(i)-'a']++;
            count2[s2.charAt(i)-'a']++;
         }

         int matches= 0;

         // COUNT THE INTIAL MATCH
         for(int i=0;i<26;i++)
         {
            if(count1[i]==count2[i])
            matches++;
         }

      //   sliding window
         for(int r=s1.length();r<s2.length();r++)
         {
            if (matches==26) return true;
            
            // check for the next char makes for breakes match
            int index= s2.charAt(r)-'a';
            count2[index]++;
            if(count2[index]==count1[index])
            {
               matches++;
            }
            else if (count1[index] + 1 == count2[index])
            {
               matches--;
            }

// remove char at left
            
            index= s2.charAt(l)-'a';
            count2[index]--;
            if(count2[index]==count1[index])
            {
               matches++;
               }
            else if (count1[index] - 1 == count2[index])
            {
               matches--;
            }
            l++;
       }
       return matches==26; 
    }
    }
}
