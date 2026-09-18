class Solution {
    public int maxProfit(int[] prices) {
       int n=prices.length;
        int sold=0;
        int rest=0;
        int hold=-prices[0];
        for(int i=1;i<n;i++)
        {
            int prevsold=sold;
            sold=hold+prices[i];
            hold=Math.max(hold,rest-prices[i]);
            rest=Math.max(rest,prevsold);
        }
        return Math.max(rest,sold);   
    }
}
