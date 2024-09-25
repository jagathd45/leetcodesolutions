class Solution {
    public String reverseWords(String s) {
       String[] re = s.trim().split("\\s+");
       String result = "";
       for(int i = re.length-1;i>=0;i--)
       {
           if(i!=0)
            {
                result+=re[i];
                result+=" ";
            }
            else if(i==0)
            {
                result += re[i];
            }
       }
       return result;
    }
}