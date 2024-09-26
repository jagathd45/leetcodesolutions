class Solution {
    public int longestPalindrome(String s) {
        int[] arr = new int[52];
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(s.charAt(i)>=65 && s.charAt(i)<=90)
            {
                arr[c-'A']++;
            }
            else{
                arr[c-'a'+26]++;
            }
        }
        int count = 0,odd = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                count += arr[i];
            }
            else if((arr[i]%2==1) && (arr[i]!=1))
            {
                count += arr[i]-1;
            }
            if(arr[i] == 1 || arr[i]%2==1)
            {
                odd = 1;
            }
        }
        return count + odd;
    }
}