class Solution {
    public int findLUSlength(String a, String b) {
        int l1 = a.length();
        int l2 = b.length();
        if(a.equals(b))
        {
            return -1;
        }
        else
        {
            if(l1>l2)
            {
                return l1;
            }
            else
            {
                return l2;
            }
        }
    }
}