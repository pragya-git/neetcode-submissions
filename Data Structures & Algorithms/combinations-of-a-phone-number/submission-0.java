class Solution {
    List<String> res=new ArrayList<>();
    String[] digitsToChar= {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"}; 
    public List<String> letterCombinations(String digits) {
            if(digits.isEmpty()) return res;
            rec(0,"",digits);
            return res;
    }
    private void rec(int i,String cur,String digits)
    {
        // base case
        if(cur.length()==digits.length())
        {
            res.add(cur);
            return;
        }
        String chars= digitsToChar[digits.charAt(i)-'0'];
        for(char c: chars.toCharArray())
        {
            rec(i+1,cur+c,digits);
        }
    }
}
