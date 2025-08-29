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
    public ListNode removeElements(ListNode head, int val) {
        ListNode cursor = head;
        while (cursor != null && cursor.val == val) {
            cursor = cursor.next;
        }
        if (cursor == null) {
            return null;
        }
        while (cursor != null && cursor.next != null) {
            // System.out.println(cursor.val);
            if (cursor.next.val == val) {
                cursor.next = cursor.next.next;
            } else {
                cursor = cursor.next;
            }
        }
        return head;
    }
}