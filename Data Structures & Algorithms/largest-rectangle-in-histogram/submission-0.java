class Solution {
    public int largestRectangleArea(int[] heights) {
       int area=0;
        int max_area=0;
        for(int i=0;i<heights.length;i++)
        {
        int minHeight = heights[i];
            for(int j=i;j<heights.length;j++)
            {
                 minHeight = Math.min(minHeight, heights[j]);
                area=minHeight*(j-i+1);
                
            max_area=Math.max(max_area,area);
            }
        }
        return max_area;  
    }
}
