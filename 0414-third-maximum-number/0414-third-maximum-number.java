class Solution {
    public int thirdMax(int[] nums) {
        /*Arrays.sort(nums);
        int n=nums.length;
        int count = 1;
        for(int i=n-1;i>0;i--)
        {
            if(nums[i]!=nums[i-1])
            {
                count++;
            }
            if(count==3)
            {
                return nums[i-1];
            }
        }
        return nums[n-1];*/
        long max1 = Long.MIN_VALUE;
        long max2 = Long.MIN_VALUE;
        long max3 = Long.MIN_VALUE;
        for(long num : nums)
        {
            if(num>max1)
            {
                max3 = max2;
                max2 = max1;
                max1 = num;
            }
            else if(num>max2 && max1>num)
            {
                max3 = max2;
                max2 = num;
            }
            else if(num>max3 && max2>num)
            {
                max3 = num;
            }
        }
        return max3 != Long.MIN_VALUE ? (int)max3 : (int)max1;
    }
}