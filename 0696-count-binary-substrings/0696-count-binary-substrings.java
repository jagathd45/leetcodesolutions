class Solution {
    public int countBinarySubstrings(String s) {
        int prev = 0;
        int curr = 1;
        int count = 0;
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i)==s.charAt(i-1))
            {
                curr++;
            }
            else
            {
                count += Math.min(prev,curr);
                prev = curr;
                curr = 1;
            }
        }
        return count + Math.min(prev , curr);
    }
}