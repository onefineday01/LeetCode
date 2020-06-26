class Solution {
    public int sumNumbers(TreeNode root) {
        return cal(0,0,root);
    }
    int cal(int curr, int ans, TreeNode root){
        if(root == null)
            return 0;
        curr = (10*curr) + root.val;
        if(root.left == null && root.right == null){
            return ans + curr;
        }
        return cal(curr, ans, root.left) + cal(curr, ans, root.right);        
    }
}