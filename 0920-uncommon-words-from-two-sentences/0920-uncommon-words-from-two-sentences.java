class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String,Integer> map = new HashMap<>();
        String[] word1 = s1.split(" ");
        String[] word2 = s2.split(" ");
        for(String word : word1)
        {
            map.put(word, map.getOrDefault(word,0)+1);
        }
        for(String word : word2)
        {
            map.put(word, map.getOrDefault(word,0)+1);
        }
        List<String> list = new ArrayList<>();
        for(String word : map.keySet())
        {
            if(map.get(word)==1)
            {
                list.add(word);
            }
        }
        return list.toArray(new String[list.size()]);
    }
}