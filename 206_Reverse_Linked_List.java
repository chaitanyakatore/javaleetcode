// Reverse of the linked list

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
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode present = head;

        while(present != null){
            ListNode next = present.next;
            present.next = prev;
            prev = present;
            present = next;
        }
        return prev;
    }
}
