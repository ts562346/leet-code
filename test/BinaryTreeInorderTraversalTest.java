import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryTreeInorderTraversalTest {
    @Test
    public void example1(){
        TreeNode root = new TreeNode(1);
        root.left = null;
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        BinaryTreeInorderTraversal traversal = new BinaryTreeInorderTraversal();

        List<Integer> result = traversal.inorderTraversal(root);

        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(3);
        expected.add(2);

        assertEquals(expected, result);
    }

    @Test
    public void example2(){
        TreeNode root = null;

        BinaryTreeInorderTraversal traversal = new BinaryTreeInorderTraversal();

        List<Integer> result = traversal.inorderTraversal(root);

        List<Integer> expected = new ArrayList<>();

        assertEquals(expected, result);
    }

    @Test
    public void example3(){
        TreeNode root = new TreeNode(1);

        BinaryTreeInorderTraversal traversal = new BinaryTreeInorderTraversal();

        List<Integer> result = traversal.inorderTraversal(root);

        List<Integer> expected = new ArrayList<>();
        expected.add(1);

        assertEquals(expected, result);
    }
}
