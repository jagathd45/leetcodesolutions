class Solution {
    public boolean checkIfPangram(String sentence) 
    {
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<sentence.length();i++)
        {
            set.add(sentence.charAt(i));
        }
        for(char i='a';i<='z';i++)
        {
            if(!set.contains(i))
            {
                return false;
            }
        }
        return true;
    }
}