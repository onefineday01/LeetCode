class Solution {
    public int countNodes(TreeNode root) {
        if(root == null) return 0;
        int level = countLevel(root, 0);
        int bottomCount = traverse(root, level, 1, 0);
        return (int)Math.pow(2, level-1)-1 + bottomCount;
    }
    private int countLevel(TreeNode root, int depth) {
        if(root == null) return depth;
        return countLevel(root.left, depth+1);
    }
    private int traverse(TreeNode root, int deepest, int level, int count) {
        if(root == null) return count;
        if(deepest == level) return count+1;
        int localCount = traverse(root.left, deepest, level+1, count);
        localCount += traverse(root.right, deepest, level+1, count);
        return localCount;
    }
}