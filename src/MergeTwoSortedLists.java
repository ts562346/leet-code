/*

21. Merge Two Sorted Lists - Easy

You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists into one sorted list. The list should be made by splicing together
the nodes of the first two lists.

Return the head of the merged linked list.

 */
public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode merged = head;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                merged.next = list1;
                list1 = list1.next;
            } else {
                merged.next = list2;
                list2 = list2.next;
            }
            merged = merged.next;
        }

        // Attach remaining nodes from either list1 or list2
        if(list1 != null)
            merged.next = list1;
        else
            merged.next = list2;

        return head.next;
    }
}
