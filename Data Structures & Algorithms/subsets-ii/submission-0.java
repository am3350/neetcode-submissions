class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
         Arrays.sort(nums);
               List<List<Integer> >ans = new ArrayList<>();
        backtrack(0,ans,new ArrayList<>(),nums);
        return ans;
    }
    private void backtrack(int index,List<List<Integer>> ans,List<Integer> curr,int nums[])
    {
        ans.add(new ArrayList<>(curr));
        for(int i=index;i<nums.length;i++)
        {
            if(i>index && nums[i]==nums[i-1]) {
                continue;
                }
            curr.add(nums[i]);
            backtrack(i+1,ans,curr,nums);
            curr.remove(curr.size()-1);
        }
    }
}
