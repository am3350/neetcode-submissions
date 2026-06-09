class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        HashSet<Character> set=new HashSet<>();
        int l=0;
        int length=0;
        for(int r=0;r<n;r++){
        while(set.contains(s.charAt(r)))
        {
           set.remove(s.charAt(l));
           l++;
        }
        set.add(s.charAt(r));
       length=Math.max(length,r-l+1);
    }
    return length;
}
}