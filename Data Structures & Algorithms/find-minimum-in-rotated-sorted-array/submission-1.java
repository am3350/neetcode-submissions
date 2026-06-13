class Solution {
    public int findMin(int[] nums) {
       int min=100000;
       for(int n:nums)
       {
        min=Math.min(min,n);
       } 
       return min;
    }
}
