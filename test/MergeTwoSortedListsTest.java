import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class MergeTwoSortedListsTest {
    /*
        Example 1:
        Input: list1 = [1,2,4], list2 = [1,3,4]
        Output: [1,1,2,3,4,4]
     */
    @Test
    void example1(){
        // Create input lists
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        // Create the expected answer
        ListNode expected = new ListNode(1);
        expected.next = new ListNode(1);
        expected.next.next = new ListNode(2);
        expected.next.next.next = new ListNode(3);
        expected.next.next.next.next = new ListNode(4);
        expected.next.next.next.next.next = new ListNode(4);

        // Perform the addition operation
        MergeTwoSortedLists test = new MergeTwoSortedLists();
        ListNode result = test.mergeTwoLists(l1, l2);

        // Check each element in the result and expected lists
        while (result != null && expected != null) {
            assertEquals(result.val, expected.val);
            result = result.next;
            expected = expected.next;
        }

        // Check if both result and expected are null, meaning both lists are traversed completely
        assertEquals(result, null);
        assertEquals(expected, null);
    }

    /*
        Example 2:
        Input: list1 = [], list2 = []
        Output: []
     */
    @Test
    void example2(){
        // Create input lists
        ListNode l1 = null; // Empty list
        ListNode l2 = null; // Empty list

        // Perform the merge operation
        MergeTwoSortedLists test = new MergeTwoSortedLists();
        ListNode result = test.mergeTwoLists(l1, l2);

        // Assert that the result is null
        assertNull(result);
    }

    /*
        Example 3:
        Input: list1 = [], list2 = [0]
        Output: [0]
    */
    @Test
    void example3(){
        // Create input lists
        ListNode l1 = null;

        ListNode l2 = new ListNode(0);

        // Create the expected answer
        ListNode expected = new ListNode(0);

        // Perform the addition operation
        MergeTwoSortedLists test = new MergeTwoSortedLists();
        ListNode result = test.mergeTwoLists(l1, l2);

        // Check each element in the result and expected lists
        while (result != null && expected != null) {
            assertEquals(result.val, expected.val);
            result = result.next;
            expected = expected.next;
        }

        // Check if both result and expected are null, meaning both lists are traversed completely
        assertEquals(result, null);
        assertEquals(expected, null);
    }
}
