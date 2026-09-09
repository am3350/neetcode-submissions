class Solution {
    public int rob(int[] nums) {
     
                int sum1=0;
       int sum2=0;
       int n=nums.length;
       if(n==1)
       {
        return nums[0];
       }
        for(int i=0;i<n-1;i++)
        {
            int curr=Math.max(sum1,sum2+nums[i]);
            sum2=sum1;;
            sum1=curr;
        }
        int sum3=0;
       int sum4=0;
        for(int i=1;i<n;i++)
        {
            int curr=Math.max(sum3,sum4+nums[i]);
            sum4=sum3;;
            sum3=curr;
        }
        return Math.max(sum1,sum3);
       
    }
}
