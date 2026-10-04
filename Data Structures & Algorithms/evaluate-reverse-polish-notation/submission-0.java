class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> stk= new Stack<>();

        for(String  token:tokens)
        {
            switch(token)
            {
                case "+" -> stk.push(stk.pop()+stk.pop());
                case "-" ->
                {
                    int a= stk.pop();
                    int b=stk.pop();
                    stk.push(b-a);     
                }
                case "*" -> stk.push(stk.pop()*stk.pop());
                case "/" -> {
                    int a= stk.pop();
                    int b=stk.pop();
                    stk.push(b/a);
                }
                default-> stk.push(Integer.parseInt(token));
            }
        }
        return stk.pop();   
    }
}
