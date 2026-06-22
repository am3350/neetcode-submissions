class Solution {
    public int findMin(int[] nums) {
       int min=0;
       for(int n:nums)
       {
        min=Math.min(min,n);
       } 
       return min;
    }
}
