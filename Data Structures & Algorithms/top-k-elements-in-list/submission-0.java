class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap <Integer,Integer> map=new HashMap();
        for(int ele:nums)
        {
            if(map.containsKey(ele))
            {
                int freq=map.get(ele);
                map.put(ele,freq+1);
            }
            else map.put(ele,1);
        }
        List<Integer> list = new ArrayList<>(map.keySet());
         Collections.sort(list, (a, b) -> map.get(b) - map.get(a));
     int ans[] = new int[k];

        for(int i = 0; i < k; i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }
}
