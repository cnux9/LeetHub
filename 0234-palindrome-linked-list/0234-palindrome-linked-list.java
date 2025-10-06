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
    public boolean isPalindrome(ListNode head) {
        List<Integer> arrList = new ArrayList<>();
        ListNode cursor = head;
        arrList.add(cursor.val);
        while (cursor.next != null) {
            cursor = cursor.next;
            arrList.add(cursor.val);
        }
        // for (int i = 0; i < arrList.size(); i++) {
        //     System.out.print(arrList.get(i) + " ");
        // }
        for (int i = 0; i < arrList.size() / 2; i++) {
            if (arrList.get(i) != arrList.get(arrList.size() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}