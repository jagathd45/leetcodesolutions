class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> list = new HashSet<>();
        Set<Integer> set = new HashSet<>();
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