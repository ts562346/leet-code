import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
/*

94. Binary Tree Inorder Traversal - Easy

Given the root of a binary tree, return the inorder traversal of its nodes' values.

 */

public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;

        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            current = stack.pop();
            result.add(current.val);
            current = current.right;
        }

        return result;
    }
}
