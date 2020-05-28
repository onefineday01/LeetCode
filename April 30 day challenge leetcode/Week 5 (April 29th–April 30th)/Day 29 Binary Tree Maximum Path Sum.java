/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    int max;
    public int maxPathSum(TreeNode root) {
        max=Integer.MIN_VALUE;
        haspath(root);
        return max;
    }
    int haspath(TreeNode root){
        if(root == null)
            return 0;
        int left =  Math.max(0,haspath(root.left));
        int right = Math.max(0,haspath(root.right));
        max = Math.max(max, root.val + left + right);
        return Math.max(left, right) + root.val;
    }
}