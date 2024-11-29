import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumDepthBinaryTreeTest {
    /*
        Example 1:

        Input: root = [3,9,20,null,null,15,7]
        Output: 3
     */
    @Test
    public void example1(){
        TreeNode levelTwoLeft = new TreeNode(9);

        TreeNode levelTwoRight = new TreeNode(20);
        levelTwoRight.left = new TreeNode(15);
        levelTwoRight.right = new TreeNode(7);

        TreeNode root = new TreeNode(3);
        root.left = levelTwoLeft;
        root.right = levelTwoRight;

        MaximumDepthBinaryTree tree = new MaximumDepthBinaryTree();

        Assertions.assertEquals(3, tree.maxDepth(root));
    }

    /*
        Example 2:

        Input: root = [1,null,2]
        Output: 2
     */
    @Test
    public void example2(){
        TreeNode root = new TreeNode(3);
        root.left = null;
        root.right = new TreeNode(2);

        MaximumDepthBinaryTree tree = new MaximumDepthBinaryTree();

        Assertions.assertEquals(2, tree.maxDepth(root));
    }
}
