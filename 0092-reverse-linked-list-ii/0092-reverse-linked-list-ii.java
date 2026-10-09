class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode tail = dummy;
        int c = 1;

        while (c < left) {
            tail = tail.next;
            c++;
        }

        ListNode iter = tail.next;
        ListNode curr = iter;
        ListNode prev = null;

        while (c <= right) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            c++;
        }

        tail.next = prev;
        iter.next = curr;

        return dummy.next;
    }
}