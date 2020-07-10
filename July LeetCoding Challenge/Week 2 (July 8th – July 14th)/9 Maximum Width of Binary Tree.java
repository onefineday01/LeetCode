class Solution {
    class node{
        TreeNode data;
        int index;
        public node(TreeNode data, int index){
            this.data = data;
            this.index = index;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        Queue<node> q = new LinkedList<>();
        q.add(new node(root, 0));
        int min = 0, max = 0, res = 1;
        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0; i<size; i++){
                node temp = q.poll();
                if(i == 0) min = temp.index;
                if(i == size-1) max = temp.index;
                if(temp!=null && temp.data.left!=null) q.add(new node(temp.data.left, 2*temp.index + 1));
                if(temp!=null && temp.data.right!=null) q.add(new node(temp.data.right, 2*temp.index + 2));       
            }
            res = Math.max(res, max - min + 1);
        }
        return res; 
    }
}