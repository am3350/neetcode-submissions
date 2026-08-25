class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
         int n = nums1.length, m = nums2.length;
        int[] result = new int[n + m];
        int i=0,j=0,k=0;
         while (i < n && j < m) {
            if (nums1[i] <= nums2[j]) {
                result[k++] = nums1[i++];
            } else {
                result[k++] = nums2[j++];
            }
        }
           while (i < n) {
            result[k++] = nums1[i++];
        }
           while (j < m) {
            result[k++] = nums2[j++];
        }
        if((m+n)%2==1)
        {
            return result[(m+n)/2];
        }
        else
        {
            return (result[(m+n)/2]+result[((m+n)/2)-1])/2.0;
        }
    }
}
