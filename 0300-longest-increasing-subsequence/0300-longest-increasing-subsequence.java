class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int ans = 1;
        for(int i=0;i<n;i++)
        {
            int max = 1;
            for(int j=i;j>=0;j--)
            {
                if(nums[j]<nums[i])
                {
                    max = Math.max(arr[j]+1,max);
                }
            }
            arr[i] = max;
            ans = Math.max(ans,max);
        }
        return ans;
    }
}