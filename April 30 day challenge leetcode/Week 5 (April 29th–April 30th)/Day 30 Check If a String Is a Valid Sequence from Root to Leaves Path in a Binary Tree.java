/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isValidSequence(TreeNode root, int[] arr) {
        return checkPath(root,arr,0);
    }
    
    private boolean checkPath(TreeNode root,int[] arr,int pos){
        if(root == null) return false;
        if(arr[pos] != root.val) return false;
        if(pos + 1 == arr.length) return root.left == null && root.right == null;
        return checkPath(root.left,arr,pos + 1) || checkPath(root.right,arr,pos + 1); 
    }   
    
}