class MinStack {
    long min;
    Stack<Long> stk;

    public MinStack()
    {
        stk=new Stack<>();
    }

    public void push(int val)
    {
        if(stk.isEmpty())
        {
            stk.push(0L);
            min=val;
        }
        else
        {
            stk.push(val-min);
           
        }
         min=Math.min(val,min);
    }
    public void pop()
    {
        if(stk.isEmpty())
        {
            return;
        }
        long poped= stk.pop();
        if(poped<0)
        {
            min=min-poped;
        }
    }
    public int top()
    {
        long top=stk.peek();
        if(top>0)
        {
            return (int) (top+min);
        }
        else
        {
            return (int) min;
        }
    }
    public int getMin()
    {
        return (int) min;
    }
}
