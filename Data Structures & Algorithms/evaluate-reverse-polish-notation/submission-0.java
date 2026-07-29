class Solution {
    public int evalRPN(String[] tokens) {
         Stack<Integer> st=new Stack<>();
       for(String to:tokens)
       {
        if(to.equals("+") || to.equals("-") || to.equals("*") || to.equals("/"))
        {
            int b=st.pop();
            int a=st.pop();
              if (to.equals("+")) st.push(a + b);
                else if (to.equals("-")) st.push(a - b);
                else if (to.equals("*")) st.push(a * b);
                else st.push(a / b);
        }
        else
        {
            st.push(Integer.parseInt(to));
        }
       }
       return st.peek();
    }
}
