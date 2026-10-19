class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length;
        int count=0;
        int i=0;
        while(i<n)
        { 
            
            if(val==nums[i])
            {
                int temp = nums[i];
            for (int k = i; k < nums.length - 1; k++) 
            {
                nums[k] = nums[k + 1];
            }
                nums[n - 1] = temp;
                n--;
            }
            else {
                count++;
                i++;
                }
        }
        return count;
    }
    
}