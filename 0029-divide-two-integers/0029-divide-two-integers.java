class Solution {
    public int divide(int dividend, int divisor) {
        long temp = (long)dividend/divisor;
        if(temp>Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        if(temp<Integer.MIN_VALUE)
            return Integer.MIN_VALUE;
        return dividend/divisor;
    }
}