class Solution {
    public String longestPalindrome(String s) {
        int resLen=0;
        int resIdx=0;
        int n= s.length();
        // inzialize flag array
        boolean[][] dp= new boolean[n][n];

        // loop expansion
        for(int i=n-1;i>=0;i--)
        {
            for(int j=i;j<n;j++)
            {
                // if previos is a sbustring or substring is very small to check i.e. one two char
                if((j-i<=2||dp[i+1][j-1])&& (s.charAt(i)==s.charAt(j)))
                {
                    dp[i][j]=true;
                    // compare resLen
                    if(resLen<j-i+1)
                    {
                    resLen= j-i+1;
                    resIdx= i;
                    }
                }
            }
        }
        // return substring based on start and end
        return s.substring(resIdx,resIdx+resLen);
    }
}
