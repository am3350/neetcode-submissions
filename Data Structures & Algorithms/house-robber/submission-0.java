class Solution {
    public int rob(int[] nums) {
                int sum1=0;
       int sum2=0;
       int n=nums.length;
        for(int i=0;i<n;i++)
        {
            int curr=Math.max(sum1,sum2+nums[i]);
            sum2=sum1;;
            sum1=curr;
        }
        return sum1;
    }
    }

