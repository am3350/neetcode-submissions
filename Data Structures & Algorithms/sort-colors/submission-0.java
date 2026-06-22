class Solution {
    public void sortColors(int[] nums) {
        int l=0;
        int m=0;
        int h=nums.length-1;
        while(m<=h)
        {
            if(nums[m]==0)
            {
                int temp=m;
                m=l;
                l=temp;
                m++;
                l++;
            }
            else if(nums[m]==1)
            {
                mid++
            }
            else{
               int temp=m;
                m=h;
                h=temp; 
                h--; 
            }
        }
    }
}