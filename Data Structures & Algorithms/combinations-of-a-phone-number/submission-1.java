class Solution {
    List<String> res =new ArrayList<>();;
    String[] digitToChar= {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
     public List<String> letterCombinations(String digits) {
            if(digits.isEmpty()) return res;
            rec(digits,0,"");
            return res;
    }
    public void rec(String digits, int i, String cur)
    {
        // base case
        if(cur.length()==digits.length())
        {
            res.add(cur);
            return;
        }
        String chars= digitToChar[digits.charAt(i)-'0'];
        for(char c: chars.toCharArray())
        {
            rec(digits, i+1, cur+c);
        }
    }
}
