class Solution {
    public int distributeCandies(int[] candyType) {
        int len = candyType.length/2;
        Set<Integer> set = new HashSet<>();
        for(int num : candyType)
        {
            if(!set.contains(num))
            {
                set.add(num);
            }
        }
        return Math.min(len,set.size());
    }
}