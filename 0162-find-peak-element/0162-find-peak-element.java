class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n];
        int i = 0;
        for(int num : nums)
        {
            arr[i] = num;
            i++;
        }
        Arrays.sort(arr);
        for(int j=0;j<n;j++)
        {
            if(arr[n-1] == nums[j])
            {
                return j;
            }
        }
        return 0;
    }
}