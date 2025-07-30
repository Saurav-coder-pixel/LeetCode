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
    public ListNode reverse(ListNode head){
        ListNode prev= null;
        ListNode curr= head;
        while(curr!= null){
            ListNode next= curr.next;
            curr.next= prev;
            prev= curr;
            curr= next;
        }
        return prev;
    }

    public ListNode FindMiddle(ListNode head){
        ListNode turtle= head;
        ListNode hare= head;
        while(hare.next!= null && hare.next.next!= null){
            turtle= head.next;
            hare= head.next.next;
        }
        return turtle;
    }

    // public boolean isPalindrome(ListNode head) {
        // if(head== null || head.next== null){
        //     return true;
        // }

    //     ListNode middle= FindMiddle(head);
    //     ListNode secHalfStart= reverse(middle.next);
        
    //     ListNode firstHalfStart= head;

    //     while(secHalfStart!= null){
    //         if(firstHalfStart.val != secHalfStart.val){
    //             return false;
    //         }
    //         firstHalfStart= firstHalfStart.next;
    //         secHalfStart= secHalfStart.next;
    //     }
    //     return true;
    // }


    public boolean isPalindrome(ListNode head) {
         if(head== null || head.next== null){
            return true;
        }

        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode rev = reverse(slow.next); 
        slow.next = null;
        while(rev != null) {
            if(head.val != rev.val) {
                return false;
            }
            head = head.next;
            rev = rev.next;
        }
        return true;
    }
}
