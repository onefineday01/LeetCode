/**
 * // This is the BinaryMatrix's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface BinaryMatrix {
 *     public int get(int x, int y) {}
 *     public List<Integer> dimensions {}
 * };
 */

class Solution {
    public int leftMostColumnWithOne(BinaryMatrix binaryMatrix) {
        int n = binaryMatrix.dimensions().get(0);
        int m = binaryMatrix.dimensions().get(1);
        int x = 0;
        int y = m-1;
        int ans = -1;
        while(x<n && y>=0){
            if(binaryMatrix.get(x, y) == 0)
                x++;
            else {
                ans = y;
                y--;
            }
        }
        return ans;
    }
}