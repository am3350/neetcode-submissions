class Solution {
    public int numDecodings(String s) {
        int n = s.length();
        if (n == 0 || s.charAt(0) == '0') return 0;
        int prev1=1,prev2=1;
       for (int i = 2; i <= n; i ++) {
        int curr=0;
        if(s.charAt(i-1)!='0')  curr+=prev1;
        int td=Integer.parseInt(s.substring(i-2,i));
        if(td<=26 && td>=10)  curr+=prev2;
   prev2=prev1;
   prev1=curr;
}
return prev1; 
    }
}
