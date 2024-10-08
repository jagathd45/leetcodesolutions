class Solution {
    public int findTheWinner(int n, int k) {
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            list.add(i);
        }
        int current = 0;
        while(list.size()>1)
        {
            int remove = (current + k-1) % list.size();
            list.remove(remove);
            current = remove;
        }
        return list.get(0);
    }
}