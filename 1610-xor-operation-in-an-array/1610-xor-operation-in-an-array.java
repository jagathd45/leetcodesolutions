class Solution {
    public int xorOperation(int n, int start) {
        int sum = 0;
        int m = start + 2*n;
        for(int i=start;i<m;i+=2)
        {
            sum = sum^i;
        }
        return sum;
    }
}