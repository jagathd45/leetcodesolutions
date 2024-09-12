class Solution {
    public int missingNumber(int[] nums) {
        int i;
        int sum1 = 0;
        for(i=0;i<nums.length;i++)
        {
            sum1+=nums[i];
        }
        int sum2 = 0;
        for(i=nums.length;i>0;i--)
        {
            sum2 += i;
        }
        return sum2-sum1;
    }
}