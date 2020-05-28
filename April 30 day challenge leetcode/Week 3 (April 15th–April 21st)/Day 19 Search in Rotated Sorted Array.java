class Solution {
    public int search(int[] nums, int target) 
    {
        if(nums == null || nums.length == 0) 
            return -1;
        
        return searchIn(nums, 0, nums.length-1, target);
    }
    int searchIn(int nums[], int low, int high, int target)
    {
        if(low > high) //base case
            return -1;
        
        int mid = (low + high) / 2; //calculating mid point
        
        if(nums[mid] == target) //element found
            return mid;
        
        if(nums[low] <= nums[mid]){ //if the left part is sorted
            if(target >= nums[low] && nums[mid] >= target){ //if target lies in the left part
                return searchIn(nums, low, mid-1, target);
            }
            else //target lies in the right part
                return searchIn(nums, mid+1, high, target); 
        }
        
        if(target >= nums[mid] && target <= nums[high])//if target lies in the right part
            return searchIn(nums, mid+1, high, target);
        return searchIn(nums, low, mid-1, target);//target lies in the left part
    }
}