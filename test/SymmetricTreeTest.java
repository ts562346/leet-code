import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SymmetricTreeTest {
    /*
        Example 1:

        Input: root = [1,2,2,3,4,4,3]
        Output: true
     */
    @Test
    public void example1(){
        TreeNode levelTwoLeft = new TreeNode(2);
        levelTwoLeft.left = new TreeNode(3);
        levelTwoLeft.right = new TreeNode(4);

        TreeNode levelTwoRight = new TreeNode(2);
        levelTwoRight.left = new TreeNode(4);
        levelTwoRight.right = new TreeNode(3);

        TreeNode root = new TreeNode(1);
        root.left = levelTwoLeft;
        root.right = levelTwoRight;

        SymmetricTree tree = new SymmetricTree();

        Assertions.assertTrue(tree.isSymmetric(root));
    }

    /*
        Example 2:

        Input: root = [1,2,2,null,3,null,3]
        Output: false
     */
    @Test
    public void example2(){
        TreeNode levelTwoLeft = new TreeNode(2);
        levelTwoLeft.left = null;
        levelTwoLeft.right = new TreeNode(3);

        TreeNode levelTwoRight = new TreeNode(2);
        levelTwoRight.left = null;
        levelTwoRight.right = new TreeNode(3);

        TreeNode root = new TreeNode(1);
        root.left = levelTwoLeft;
        root.right = levelTwoRight;

        SymmetricTree tree = new SymmetricTree();

        Assertions.assertFalse(tree.isSymmetric(root));
    }
}
