class Solution {
    public int addDigits(int num) {
        while(num>9)
        {
            int sum = 0;
            while(num>0)
            {
                int rem = num%10;
                sum += rem; 
                num = num/10; 
            }
            if(sum<10)
            {
                return sum;
            }
            else if(sum>9)
            {
                num = sum;
            }
        }
        return num;
    }
}