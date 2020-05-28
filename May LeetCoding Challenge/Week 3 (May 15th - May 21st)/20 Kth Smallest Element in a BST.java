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
    public int kthSmallest(TreeNode root, int k) {
        if(root == null)
            return 0;
        Stack<TreeNode> s = new Stack<>();
        TreeNode curr = root;
        boolean done = false;
        int count=0;
        int ans=0;
        while(!done){
            if(curr!=null){
                s.push(curr);
                curr=curr.left;
            }
            else{
                if(s.empty())
                    done=true;
                else{
                    curr =  s.pop();
                    count++;
                    if(count==k){
                        ans=curr.val;
                        break;
                    }
                    curr=curr.right;
                }
            }
        }
        return ans;
    }
}