class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap();
        int count = 0, ans = 0;
        map.put(count, -1);
        for(int i = 0; i < nums.length; i++){
        	count += nums[i] == 0 ? -1 : 1;
        	if(map.containsKey(count))
        		ans = Math.max(ans, (i - map.get(count)));
        	else
        		map.put(count, i);
        }
        return ans;
    }
}