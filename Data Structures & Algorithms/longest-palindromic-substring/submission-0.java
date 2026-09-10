class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        String longest="";
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                String sub=s.substring(i,j);
                String rev=new StringBuilder(sub).reverse().toString();
                if(sub.equals(rev) && sub.length()>longest.length())
                {
                    longest=sub;
                }
            }
        }
        return longest;
    }
}

