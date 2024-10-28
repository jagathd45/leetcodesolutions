class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] arr = new int[2];
        Arrays.sort(nums);
        int k=0;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i] == nums[i+1])
            {
                arr[k++] = nums[i];
            }
        }
        return arr;
    }
}