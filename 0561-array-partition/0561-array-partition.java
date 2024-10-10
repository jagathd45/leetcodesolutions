class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int sum = 0,i = 0;
        while(i<n)
        {
            sum += nums[i];
            i += 2;
        }
        return sum;
    }
}