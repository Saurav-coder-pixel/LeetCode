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
        if (head == null || head.next == null) {
            return true;
        }
    
        ListNode duplicate = duplicateList(head);
        ListNode reversed = reverseList(duplicate);
        
        ListNode originalCurrent = head;
        ListNode reversedCurrent = reversed;
        
        while (originalCurrent != null && reversedCurrent != null) {
            if (originalCurrent.val != reversedCurrent.val) {
                return false;
            }
            originalCurrent = originalCurrent.next;
            reversedCurrent = reversedCurrent.next;
        }
        
        return true;
    }
    
    private ListNode duplicateList(ListNode head) {
        if (head == null) return null;
        
        ListNode newHead = new ListNode(head.val);
        ListNode original = head.next;
        ListNode copy = newHead;
        
        while (original != null) {
            copy.next = new ListNode(original.val);
            copy = copy.next;
            original = original.next;
        }
        
        return newHead;
    }
    
    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        ListNode Next= null;
        
        while (current != null) {
            Next = current.next;
            current.next = prev;
            prev = current;
            current = Next;
        }
        
        return prev;
    }
}
