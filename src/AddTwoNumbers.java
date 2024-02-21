/*

2. Add Two Numbers - Easy

You are given two non-empty linked lists representing two non-negative integers.
The digits are stored in reverse order, and each of their nodes contains a single digit.
Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

 */

public class AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sum = new ListNode();
        ListNode head = sum;
        int carry = 0;
        ListNode p1 = l1;
        ListNode p2 = l2;
        while (p1 != null && p2 != null){
            int sum_temp = p1.val + p2.val + carry;

            carry = (sum_temp - (sum_temp % 10)) / 10;
            sum_temp = sum_temp % 10;

            sum.next = new ListNode(sum_temp);

            sum = sum.next;
            p1 = p1.next;
            p2 = p2.next;
        }

        ListNode remaining;

        if (p1 != null)
            remaining = p1;
        else
            remaining = p2;

        while (remaining != null){
            int sum_temp = remaining.val + carry;

            carry = (sum_temp - (sum_temp % 10)) / 10;
            sum_temp = sum_temp % 10;

            sum.next = new ListNode(sum_temp);

            sum = sum.next;
            remaining = remaining.next;
        }

        if (carry > 0)
            sum.next = new ListNode(carry);

        return head.next;
    }

    public static void main (String [] main){
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

        ListNode currentNode = addTwoNumbers(l1, l2);
        while(currentNode != null) {
            System.out.println(currentNode.val);
            currentNode = currentNode.next;
        }
    }
}
