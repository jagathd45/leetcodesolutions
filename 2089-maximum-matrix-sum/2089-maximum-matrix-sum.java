class Solution {
    public long maxMatrixSum(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        long sum = 0;
        int count = 0;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                int number = Math.abs(matrix[i][j]);
                sum += number;
                if(matrix[i][j]<0) count++;
                min = Math.min(min,number);
            }
        }
        return count % 2 == 0 ? sum : sum - 2*min;
    }
}