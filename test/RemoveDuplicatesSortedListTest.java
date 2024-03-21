import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertTrue;

public class RemoveDuplicatesSortedListTest {
    // Helper method to compare two lists
    private boolean compareLists(ListNode list1, ListNode list2) {
        while (list1 != null && list2 != null) {
            // If values are not equal, lists are not equal
            if (list1.val != list2.val) {
                return false;
            }
            // Move to the next nodes in both lists
            list1 = list1.next;
            list2 = list2.next;
        }
        // If one list is longer than the other, they are not equal
        return list1 == null && list2 == null;
    }

    /*
        Example 1:
        Input: head = [1,1,2]
        Output: [1,2]
     */
    @Test
    void example1(){
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(2);

        node1.next = node2;
        node2.next = node3;

        RemoveDuplicatesSortedList test = new RemoveDuplicatesSortedList();
        ListNode list1 = test.deleteDuplicates(node1);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(2);

        assertTrue(compareLists(list1, list2));

    }
    /*
        Example 2:
        Input: head = [1,1,2,3,3]
        Output: [1,2,3]
     */
    @Test
    void example2(){
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(3);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        RemoveDuplicatesSortedList test = new RemoveDuplicatesSortedList();
        ListNode list1 = test.deleteDuplicates(node1);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(2);
        list2.next.next = new ListNode(3);

        assertTrue(compareLists(list1, list2));

    }

    /*
        Example 3:
        Input: head = []
        Output: []
     */
    @Test
    void example3(){
        ListNode node1 = new ListNode();

        RemoveDuplicatesSortedList test = new RemoveDuplicatesSortedList();
        ListNode list1 = test.deleteDuplicates(node1);

        ListNode list2 = new ListNode();

        assertTrue(compareLists(list1, list2));

    }
}
