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
        ListNode l1 = new ListNode();
        ListNode head = l1;

        while(list1!=null && list2!=null)
        {
            ListNode d = new ListNode();
            l1.next = d;
            if(list1.val <= list2.val)
            {
                d.val = list1.val;
                list1 = list1.next;
            }

            else
            {
                d.val = list2.val;
                list2 = list2.next;
            }
            l1 = l1.next;
        }

        if(list1==null) l1.next = list2;
        else l1.next = list1;

        return head.next;
    }
}