class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result=new ArrayList<>();
        backtrack(n, result,new StringBuilder(),0,0);
    return result;
    }
    public void backtrack(int n, List<String> result, StringBuilder current, int open, int close)
    {
        if(current.length()==2*n){
        result.add(current.toString());
        return;
        }
            if(open<n) {
            current.append('(');
            backtrack(n, result, current, open + 1,close);
            current.deleteCharAt(current.length() - 1);
            }
            if(close<open)
            {
            current.append(')');
            backtrack(n, result, current, open,close+1);
            current.deleteCharAt(current.length() - 1);
            
    }
    }
}
