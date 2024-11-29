public class MaximumDepthBinaryTree {
    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;

        int heightRight = maxDepth(root.right);
        int heightLeft = maxDepth(root.left);

        return Math.max(heightRight, heightLeft) + 1;
    }
}
