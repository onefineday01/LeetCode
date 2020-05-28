class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int maxsofar = nums[0];
        for(int i=1;i<nums.length;i++){
            maxsofar = Math.max(maxsofar + nums[i], nums[i]);
            max = Math.max(max, maxsofar);
        }
        return max;
    }
}