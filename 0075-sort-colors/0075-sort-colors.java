class Solution {
    public void sortColors(int[] nums) {
        int red = 0;
        int white = 0;
        int blue = nums.length-1;
        int temp;
        while(white<=blue)
        {
            if(nums[white]==0)
            {
                temp = nums[white];
                nums[white] = nums[red];
                nums[red] = temp;
                red++;
                white++;
            }
            else if(nums[white]==1)
            {
                white++;
            }
            else
            {
                temp = nums[white];
                nums[white] = nums[blue];
                nums[blue] = temp;
                blue--;
            }
        }
    }
}