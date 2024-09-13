class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int buy = prices[0];
        for(int j=1;j<prices.length;j++)
        {
            if(buy<prices[j])
            {
                int profit = prices[j] - buy;
                max = Math.max(max,profit);
            }
            else
            {
                buy = prices[j];
            }
        }
        return max;
    }
}