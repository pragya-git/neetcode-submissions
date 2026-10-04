class Solution {
    public boolean isPalindrome(String s) {
        int e=s.length()-1;
        int b=0;
        while(b<e)
        {
            while(b<e && !Character.isLetterOrDigit(s.charAt(b)))
            {
                b++;
            }
            while(b<e && !Character.isLetterOrDigit(s.charAt(e)))
            {
                e--;
            }
            if(Character.toLowerCase(s.charAt(b))!=(Character.toLowerCase(s.charAt(e))))
            {
                return false;
            }
            b++;
            e--;
        }
        return true;
    }
}
