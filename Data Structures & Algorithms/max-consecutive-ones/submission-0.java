class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int k=0;
        int km=0;

        for(int i=0;i<nums.length;i++)
        {
            if(1==nums[i]){
                k++;
            }
            else
            {
                km = Math.max(km, k);
                k=0;
            }
        }

        km = Math.max(km, k);
        return km;  
    }
}