import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*

21. Merge Two Sorted Lists - easy

You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists into one sorted list. The list should be made by splicing together
the nodes of the first two lists.

Return the head of the merged linked list.

 */
public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(); // Dummy node to simplify logic
        ListNode merged = head; // Start with the dummy node

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                merged.next = list1; // Attach smaller node
                list1 = list1.next; // Move list1 pointer
            } else {
                merged.next = list2; // Attach smaller node
                list2 = list2.next; // Move list2 pointer
            }
            merged = merged.next; // Move merged pointer
        }

        // Attach remaining nodes from either list1 or list2
        if(list1 != null)
            merged.next = list1;
        else
            merged.next = list2;
//        merged.next = (list1 != null) ? list1 : list2;

        return head.next; // Skip the dummy node
    }
}
