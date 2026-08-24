class Solution {
    public String minWindow(String s, String t) {
        if(s==null||t==null||s.length()==0||t.length()==0||s.length()<t.length()) return "";
      int need[]=new int[128];
       for(char c:t.toCharArray())
       {
        need[c]++;
       }
       int required=0;
        for(int count:need)
        {
            if(count>0)
            {
                required++;
            }
        }
        int window[]=new int[128];
      int left=0;
      int right=0;
      int minlen=Integer.MAX_VALUE;
      int minstart=0;
      int formed=0;
      while(right<s.length())
      {
        char c=s.charAt(right);
        window[c]++;
        if(need[c]>0 && need[c]==window[c])
        {
            formed++;
        }
        while(formed==required)
        {
            if(right-left+1<minlen)
            {
                minlen=right-left+1;
                minstart=left;
            }
            char leftchar=s.charAt(left);
            window[leftchar]--;
            if(need[leftchar]>0 && window[leftchar]<need[leftchar])
            {
                formed--;
            }
            left++;
        }
        right++;
      }
      return minlen==Integer.MAX_VALUE ? "": s.substring(minstart,minstart+minlen);
    }
}
