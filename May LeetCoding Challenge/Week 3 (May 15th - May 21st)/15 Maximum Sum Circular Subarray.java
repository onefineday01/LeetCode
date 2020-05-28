class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int sum1 = kadane(nums);
        int sum2 = 0;
        for(int i = 0; i < nums.length; i++){
            sum2 +=  nums[i];
            nums[i] = -nums[i];
        }
        sum2 += kadane(nums);
        if(sum2 == 0)
            return sum1;
        return sum1 > sum2 ? sum1 : sum2 ;
    }
    public int kadane(int[] nums) {
        int max = nums[0];
        int maxsofar = nums[0];
        for(int i=1;i<nums.length;i++){
            maxsofar = Math.max(maxsofar + nums[i], nums[i]);
            max = Math.max(max, maxsofar);
        }
        return max;
    }
}