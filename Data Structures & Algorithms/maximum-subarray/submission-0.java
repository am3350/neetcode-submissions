class Solution {
    public int maxSubArray(int[] nums) {
        int sum=Integer.MIN_VALUE;
       int n=nums.length;
        int s=0;
       for(int i=0;i<n;i++)
       {
        s+=nums[i];
        sum=Math.max(sum,s);
        if(s<0)
        {
            s=0;
        }
       } 
       return sum;
       
    }
}
