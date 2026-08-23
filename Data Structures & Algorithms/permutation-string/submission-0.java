class Solution {
    public boolean checkInclusion(String s1, String s2) {
            int n1=s1.length();
       int n2=s2.length();
       if(n1>n2)
       {
        return false;
       }
       int need[]=new  int[26];
       int window[]=new int[26];
       for(char c:s1.toCharArray())
       {
        need[c-'a']++;
       }
       for(int i=0;i<n1;i++)
       {
        window[s2.charAt(i)-'a']++;
       }
        if(matches(need,window)) return true;
       
            for (int i = n1; i < n2; i++) {
            window[s2.charAt(i) - 'a']++;
            window[s2.charAt(i - n1) - 'a']--; 
            if (matches(need, window)) return true;}
     
        return false;}
    private boolean matches(int need[],int window[]){
        for(int i=0;i<26;i++){
            if(need[i]!=window[i]) return false;}
        return true;
    }
}
