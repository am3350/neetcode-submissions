class Solution {
    public int maxArea(int[] heights) {
        int n=heights.length;
        int left=0;
        int right=n-1;
        int max=0;
        while(left<right)
        {
            int m=(right-left)*Math.min(heights[left],heights[right]);
            if(max<m)
            {
                max=m;
               if(heights[left] < heights[right])
                {
                    left++;
                }
                else right--;
            }
            else{
                   if(heights[left] < heights[right])
                {
                    left++;
                }
                else right--;
            }
            continue;
            } 
            return max;
        }
        
    }

