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

    public ListNode midNode(ListNode head)
    {
        if(head == null || head.next == null) return head;
        
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
    }
    

    
    public ListNode reverseLL(ListNode head)
    {
        if(head == null) return head;
        
        ListNode curr = head;
        ListNode prev = null;
        ListNode forw = null;
        
        while(curr != null)
        {
            forw = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forw;
        }
        
        return prev;
        
    }
    public boolean isPalindrome(ListNode head) {

        if(head == null || head.next == null) return true;
        
        ListNode mid = midNode(head);
        ListNode nhead = mid.next;
        mid.next = null;
        nhead = reverseLL(nhead);
        ListNode c1 = head;
        ListNode c2 = nhead;
        boolean res = true;
        
        while(c2 != null)
        {
            if(c1.val != c2.val)
            {
                res = false;
                break;
            }
            c1 = c1.next;
            c2 = c2.next;
        }
        
        reverseLL(nhead);
        mid.next = nhead;
        return res;
    }
}