class Solution {
    public List<List<String>> partition(String s) {
                List<List<String>>ans = new ArrayList<>();
        backtrack(0,ans,new ArrayList<>(),s);
        return ans;
    }
    private void backtrack(int index,List<List<String>> ans,List<String> curr,String s)
    {
    if(index==s.length())
    {
        
        ans.add(new ArrayList<>(curr));
        return;
    }
        for(int i=index;i<s.length();i++)
        {
            String sub=s.substring(index,i+1);
            if(ispalindrome(sub))
            {
            curr.add(sub);
            backtrack(i+1,ans,curr,s);
            curr.remove(curr.size()-1);  
            }
            
        }
    }
   private boolean ispalindrome(String str) {
    int left = 0, right = str.length() - 1;
    while (left < right) {
        if (str.charAt(left) != str.charAt(right)) return false;
        left++;
        right--;
    }
    return true;
}
}
