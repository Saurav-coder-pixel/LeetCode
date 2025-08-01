class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next== null){
            return head;
        }

        ListNode prevNode= head;
        ListNode currNode= head.next;

        while(currNode!= null){
            ListNode nextNode= currNode.next;
            currNode.next= prevNode;

            prevNode= currNode;
            currNode= nextNode;
        }

        head.next= null;
        head =prevNode;
        return prevNode;
    }
}





class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next== null){
            return head;
        }

        ListNode newHead= reverseList(head.next);
            head.next.next= head;
            head.next= null;
            return newHead;
        }
}
