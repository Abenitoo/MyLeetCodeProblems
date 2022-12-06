package medium.add_two_numbers;


/**
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse
 * order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
 * <p>
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * <p>
 * <a href="https://leetcode.com/problems/add-two-numbers/">...</a>
 */
public class AddTwoNumbers {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int l1Val = l1.val;
        int l2Val = l2.val;
        l1 = l1.next;
        l2 = l2.next;
        int sum = l1Val + l2Val;
        int carry = sum >= 10 ? 1 : 0;
        sum = sum % 10;
        ListNode next = new ListNode(0, null);
        ListNode firstNode = (l1 != null || l2 != null) ? new ListNode(sum, next) : new ListNode(sum, null);
        ListNode prev = null;
        while (l1 != null || l2 != null) {

            next.next = prev;
            next = next.next != null ? next.next : next;
            l1Val = l1 != null ? l1.val : 0;
            l2Val = l2 != null ? l2.val : 0;
            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;

            sum = l1Val + l2Val + carry;
            carry = sum >= 10 ? 1 : 0;
            sum = sum % 10;

            next.val = sum;
            prev = new ListNode(sum, null);
        }

        if (carry == 1 && firstNode.next != null) {
            next.next = new ListNode(1, null);
        } else if (carry == 1) {
            firstNode.next = new ListNode(1, null);
        }

        return firstNode;
    }

}
