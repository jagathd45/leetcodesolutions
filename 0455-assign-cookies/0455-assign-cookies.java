class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int count = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        for(int i=0,j=0;i<g.length;)
        {
            if(j>=s.length)
            {
                break;
            }
            if(g[i]>s[j])
            {
                j++;
            }
            else
            {
                count++;
                i++;
                j++;
            }
        }
        return count;
    }
}