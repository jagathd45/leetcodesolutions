class Solution {
    public int heightChecker(int[] heights) {
        int n = heights.length;
        int[] arr = Arrays.copyOf(heights,n);
        Arrays.sort(arr);
        int count = 0;
        for(int i=0;i<n;i++)
        {
            if(arr[i] != heights[i])
            {
                count++;
            }
        }
        return count;
    }
}