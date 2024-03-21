/*

83. Remove Duplicates from Sorted List - Easy

Given the head of a sorted linked list, delete all duplicates such
that each element appears only once. Return the linked list sorted
as well.

 */
public class RemoveDuplicatesSortedList {
    public ListNode deleteDuplicates(ListNode head) {

        ListNode current = head;

        if (head == null || head.next == null) {
            return head;
        }

        while(current.next != null){
            if(current.val == current.next.val){
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return head;
    }
}
