class Solution {
    public int numberOfMatches(int n) {
       int sum = 0;
       int a = 0;
       while(n!=1)
       {
        if(n%2==0)
        {
            a = n/2;
            n = n/2;
        }
        else
        {
            a = (n-1)/2;
            n = a+1;
        }
        sum += a;
       }
       return sum; 
    }
}