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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();
        Stack<List<Integer>> res = new Stack<>();
        if(root == null) return ans;
        q.offer(root);
        while(!q.isEmpty()){
            int levelSize = q.size();
            List<Integer> current = new ArrayList<>();
            for (int i = 0; i < levelSize; i++) {
                TreeNode node = q.poll();
                current.add(node.val);
                if (node.left != null) q.offer(node.left);
                if (node.right != null) q.offer(node.right);
            }    
            res.add(current);
        }
        while(!res.empty()) ans.add(res.pop());
       return ans; 
    }
}