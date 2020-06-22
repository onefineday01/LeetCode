class Solution {
    public void sortColors(int[] nums) {
        int i = 0, j = nums.length - 1; 
        int mid = 0, temp = 0; 
        while (mid <= j) { 
            switch (nums[mid]) { 
            case 0: 
                temp = nums[i]; 
                nums[i] = nums[mid]; 
                nums[mid] = temp; 
                i++; 
                mid++; 
                break; 
            case 1: 
                mid++; 
                break; 
            case 2:
                temp = nums[mid]; 
                nums[mid] = nums[j]; 
                nums[j] = temp; 
                j--; 
                break;
            } 
        }
    } 
}