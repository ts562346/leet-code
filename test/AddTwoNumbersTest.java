import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AddTwoNumbersTest {
    /*
        Example 1:
        Input: l1 = [2,4,3], l2 = [5,6,4]
        Output: [7,0,8]
        Explanation: 342 + 465 = 807.
     */
    @Test
    void example1() {
        // Create input lists
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        // Create the expected answer
        ListNode expected = new ListNode(7);
        expected.next = new ListNode(0);
        expected.next.next = new ListNode(8);

        // Perform the addition operation
        AddTwoNumbers test = new AddTwoNumbers();
        ListNode result = test.addTwoNumbers(l1, l2);

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
        Input: l1 = [0], l2 = [0]
        Output: [0]
     */
    @Test
    void example2(){
        // Create input lists
        ListNode l1 = new ListNode(0);

        ListNode l2 = new ListNode(0);

        // Create the expected answer
        ListNode expected = new ListNode(0);

        // Perform the addition operation
        AddTwoNumbers test = new AddTwoNumbers();
        ListNode result = test.addTwoNumbers(l1, l2);

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
        Example 3:
        Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
        Output: [8,9,9,9,0,0,0,1]
     */
    @Test
    void example3(){
        // Create input lists
        ListNode l1 = new ListNode(9);
        l1.next = new ListNode(9);
        l1.next.next = new ListNode(9);
        l1.next.next.next = new ListNode(9);
        l1.next.next.next.next = new ListNode(9);
        l1.next.next.next.next.next = new ListNode(9);
        l1.next.next.next.next.next.next  = new ListNode(9);

        ListNode l2 = new ListNode(9);
        l2.next = new ListNode(9);
        l2.next.next = new ListNode(9);
        l2.next.next.next = new ListNode(9);

        // Create the expected answer
        ListNode expected = new ListNode(8);
        expected.next = new ListNode(9);
        expected.next.next = new ListNode(9);
        expected.next.next.next = new ListNode(9);
        expected.next.next.next.next = new ListNode(0);
        expected.next.next.next.next.next = new ListNode(0);
        expected.next.next.next.next.next.next  = new ListNode(0);
        expected.next.next.next.next.next.next.next  = new ListNode(1);

        // Perform the addition operation
        AddTwoNumbers test = new AddTwoNumbers();
        ListNode result = test.addTwoNumbers(l1, l2);

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