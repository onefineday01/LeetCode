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
    class Pair{
        TreeNode parent;
        int level;
        
        Pair(TreeNode parent, int level){
            this.parent = parent;
            this.level = level;
        }
    }
    
    public boolean isCousins(TreeNode root, int x, int y) {
        Pair pair1 = isCousinsHelper(root, x, null, 0);
        Pair pair2 = isCousinsHelper(root, y, null, 0);

        return pair1.level == pair2.level && pair1.parent != pair2.parent;
    }
    
    Pair isCousinsHelper(TreeNode root, int val, TreeNode parent, int level){
        if(root == null){
            return null;
        }
        if(root.val == val){
            return new Pair(parent, level);
        }
        Pair leftPair = isCousinsHelper(root.left, val, root, level + 1);
        Pair rightPair = isCousinsHelper(root.right, val, root, level + 1);
        return leftPair == null ? rightPair : leftPair;
    }
}