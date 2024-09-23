class Solution {
    public int findMin(int[] nums) {
        int a = nums[0];
        for(int i = 1;i<nums.length;i++)
        {
            if(a>nums[i])
            {
                a = nums[i];
            }
        }
        return a;
    }
}