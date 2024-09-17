class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int sum1=0,sum2=0;
        for(int i=0;i<n;i++)
        {
            sum1 += gas[i];
            sum2 += cost[i]; 
        }
        if(sum1<sum2)
        {
            return -1;
        }
        int res = 0;
        int remain = 0;
        for(int i=0;i<n;i++)
        {
            remain += gas[i] - cost[i];
            if(remain<0)
            {
                res = i+1;
                remain = 0;
            }
        }
        return res;
    }
}