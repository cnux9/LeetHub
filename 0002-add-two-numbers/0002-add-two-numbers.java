/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode firstNode = l1;
        boolean isCarry = false;

        while (l1 != null || l1 != null || isCarry) {
            int a = (l1 != null) ? l1.val : 0;
            int b = (l2 != null) ? l2.val : 0;

            int sum = a + b;
            if (isCarry) {
                sum += 1;
            }
            isCarry = ( sum >= 10 );
            if (isCarry) {
                sum -= 10;
            }

            l1.val = sum;
            if (l1.next == null) {
                if ((l2 != null && l2.next != null) || isCarry) {
                    l1.next = new ListNode();
                }
            }
            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }

        return firstNode;
    }
}