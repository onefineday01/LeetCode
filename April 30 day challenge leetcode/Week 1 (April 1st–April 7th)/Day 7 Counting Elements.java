class Solution {
    public int countElements(int[] arr) {
        if(arr == null || arr.length == 0)
            return 0;
        HashSet<Integer> set = new HashSet();
        for(int i : arr)
            set.add(i);
        int count = 0;
        for(int i : arr)
            if(set.contains(i+1))
                count++;
        return count;
    }
}