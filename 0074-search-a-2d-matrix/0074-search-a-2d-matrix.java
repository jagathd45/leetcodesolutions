class Solution {
    public boolean searchMatrix(int[][] matrix, int target) 
    {
       /* for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==target)
                {
                    return true;
                }
            }
        }
        return false;*/
        int row = matrix.length;
        int col = matrix[0].length;
        int left = 0;
        int right = row*col -1;
        while(left<=right)
        {
            int mid = (right+left)/2;
            int i = mid/col;
            int j = mid%col;
            if(matrix[i][j] == target)
            {
                return true;
            }
            else if(matrix[i][j]<target)
            {
                left = mid + 1;
            }
            else
            {
                right = mid - 1;
            }
        }
        return false;
    }
}