class Solution {
    public int sumOfMultiples(int n) {
        int sum = 0;
        for(int i=1;i<=n;i++)
        {
            int num = i;
            if(num%3==0 || num%5==0 || num%7==0)
            {
                sum = sum + num;
            }
        }
        return sum;
    }
}