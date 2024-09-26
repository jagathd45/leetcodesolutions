class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        List<Integer> set = new ArrayList<>();
        for(int num : nums1)
        {
            list.add(num);
        }
        int i = 0;
        for(int num : nums2)
        {
            if(list.contains(num))
            {
                set.add(num);
                list.remove((Integer)num);
            }
        }
        int[] arr = new int[set.size()];
        for(int num : set)
        {
            arr[i] = num;
            i++;
        }
        return arr;
    }
}