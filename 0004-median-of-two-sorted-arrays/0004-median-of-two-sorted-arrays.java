class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] arr = new int[n1+n2];
        int k=0;
        for(int i=0;i<n1;i++)
        {
            arr[k++] = nums1[i];
        }
        for(int j=0;j<n2;j++)
        {
            arr[k++] = nums2[j];
        }
        Arrays.sort(arr);
        if(k%2==1)
        {
            return arr[k/2];
        }
        else
        {
            int mid1 = arr[k/2 -1];
            int mid2 = arr[k/2];
            return ((double)mid1 + (double)mid2)/2.0;
        }
    }
}