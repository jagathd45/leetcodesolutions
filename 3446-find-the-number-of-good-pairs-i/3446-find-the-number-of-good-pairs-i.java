class Solution {
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int count = 0;
        for(int i=0;i<nums1.length;i++)
        {
            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i]%(k*nums2[j]) == 0)
                {
                    count++;
                }
            }
        }
        return count;
    }
}