public class Solution {
    int[] maxLen; // whether got visited if yes store its max length
    int[] path; // remember the path of max length trace
    int len;
    
     public int helper(int cur, int[] nums) {
        if (cur > len ) return 0;
        if ( maxLen[cur] > 0 ) return maxLen[cur];
        path[cur] = cur;
        int curMax = 0;
        long curVal = (long)nums[cur]; 
        long i=2; // factor for next multiple
        long next = curVal * i; // next multiple
        int nid = cur+1;
        // teminated when next mulitiple is out of range or it is the last one
        while ( next <= (long) nums[len-1] && nid < len ) {
            if ( nums[nid] < next ) { 
                // call binary search only when the next value is smaller than next multiple 
                // and find the ceiling value of the multiple
                nid = Arrays.binarySearch(nums, nid+1, len, (int)next );
                if (nid < 0) nid = -(nid+1);
            } else {
                // the ceiling value is a multiple
                if ( nums[nid] % nums[cur] == 0 ) {
                    int temp = helper(nid, nums);
                    if (temp > curMax ) {
                        curMax = temp;
                        path[cur] = nid;
                    }
                }
                // increase the factor for next multiple
                i= (nums[nid]/nums[cur])+1;
                next = curVal * i;
            }
        }
        maxLen[cur] = curMax+1;
        return maxLen[cur];
    }
    
    public List<Integer> largestDivisibleSubset(int[] nums) {
        List<Integer> ret = new ArrayList();
        if (nums==null || nums.length ==0) return ret;
        len = nums.length;
        if (len == 1) { 
            ret.add(nums[0]);
            return ret;
        }
        maxLen = new int[len];
        path = new int[len];
        int max = 0;
        int idx = -1;
        Arrays.sort(nums);
        for (int i=0; i<len; i++) {
            int temp = helper( i, nums);
            if (temp > max ) {
                max = temp;
                idx = i;
            }
        }
        while (idx != path[idx]) {
            ret.add(nums[idx]);
            idx = path[idx];
        }
        ret.add(nums[idx]);
        return ret;
    }
}