class Solution {
    public boolean isValid(String s) {
      Stack<Character> stk= new Stack<>();
      for(char ch:s.toCharArray())
      {
        if(ch=='('||ch=='{'||ch=='['){
            stk.push(ch);
        }
        else
        {
            if(stk.isEmpty()) return false;
            char open = stk.pop();
            if(open == '(' && ch!=')')
            return false;
            else if(open == '{' && ch!='}')
            return false;
            else if(open == '[' && ch!=']')
            return false;
        }
      } 
      return stk.isEmpty(); 
    }
}
