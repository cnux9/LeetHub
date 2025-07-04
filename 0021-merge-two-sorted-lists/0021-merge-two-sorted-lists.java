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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode firstNode;

        if (list1 == null) {
            return list2;
        }

        if (list2 == null) {
            return list1;
        }

        if (list1.val > list2.val) {
            firstNode = list2;
            list2 = list2.next;
        } else {
            firstNode = list1;
            list1 = list1.next;
        }

        ListNode cursor = firstNode;
        while (list1 != null && list2 != null) {
            if (list1.val > list2.val) {
                cursor.next = list2;
                list2 = list2.next;
            } else {
                cursor.next = list1;
                list1 = list1.next;
            }
            cursor = cursor.next;
        }

        if (list1 != null) {
            cursor.next = list1;
        } else {
            cursor.next = list2;
        }

        return firstNode;
    }
}