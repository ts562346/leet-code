import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SameTreeTest {
    /*
    Example 1:

    Input: p = [1,2,3], q = [1,2,3]
    Output: true
     */
    @Test
    public void example1(){
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);

        SameTree tree = new SameTree();

        Assertions.assertTrue(tree.isSameTree(root1, root2));
    }
    /*
    Example 2:

    Input: p = [1,2], q = [1,null,2]
    Output: false
     */
    @Test
    public void example2(){
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);

        TreeNode root2 = new TreeNode(1);
        root2.left = null;
        root2.right = new TreeNode(3);

        SameTree tree = new SameTree();

        Assertions.assertFalse(tree.isSameTree(root1, root2));
    }
    /*
    Example 3:

    Input: p = [1,2,1], q = [1,1,2]
    Output: false
     */
    @Test
    public void example3(){
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(1);

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(1);
        root2.right = new TreeNode(2);

        SameTree tree = new SameTree();

        Assertions.assertFalse(tree.isSameTree(root1, root2));
    }
}
