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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dum = new ListNode(0);
        dum.next = head;
        ListNode curr = dum;
        ListNode prev = dum;


        for(int i=0;i<n;i++)
        {
            if(curr.next!=null) curr = curr.next;
        }

        while(curr.next!=null){
            prev = prev.next;
            curr = curr.next;
        }

        prev.next = prev.next.next;

        return dum.next;

    }
}