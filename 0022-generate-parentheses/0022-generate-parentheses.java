class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> res = new ArrayList<>();
        rec(res,0,0,"",n);
        return res;
    }
    public void rec(List<String>res,int left,int right,String s,int n)
    {
        if(s.length()==n*2)
        {
            res.add(s);
            return ;
        }
        if(left<n)
        {
            rec(res,left+1,right,s + "(",n);
        }
        if(right<left)
        {
            rec(res,left,right+1,s + ")",n);
        }
    }
}