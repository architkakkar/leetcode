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
    // delete: 6, list: [6,6,6,4,5,6,2]
    public ListNode removeElements(ListNode head, int val) {
        // empty list
        if (head == null) return head;

        // match is at head
        while (head != null && head.val == val) {
            head = head.next;
        }
        
        // entire list was same val and got empty
        if (head == null) return head;

        // anywhere else in the list
        ListNode curr = head;
        while (curr.next != null) {
            if (curr.next.val == val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }

        return head;
    }
}