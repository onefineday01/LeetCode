class Solution {
    public int rangeBitwiseAnd(int m, int n) {
        while(m < n) 
            n -= (n & -n);  //flipping rightmost set bit
        return n;  
    }
}