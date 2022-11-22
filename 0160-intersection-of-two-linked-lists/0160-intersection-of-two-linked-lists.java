/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {

    public int getSize(ListNode node) {
        if (node == null) return 0;
        int size = 0;
        while (node != null) {
            node = node.next;
            size++;
        }
        return size;
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;

        int A = getSize(headA);
        int B = getSize(headB);
        ListNode t1 = headA;
        ListNode t2 = headB;

        int diff = Math.abs(A - B);
        if (A > B) {
            for (int i = 0; i < diff; i++) {
                t1 = t1.next;
            }
        } else {
            for (int i = 0; i < diff; i++) {
                t2 = t2.next;
            }
        }
        while (t1 != t2) {
            t1 = t1.next;
            t2 = t2.next;
        }
        return t1;
    }
}
