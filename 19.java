class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next== null){
            return null;
        }

        int size=0;
        ListNode curr= head;
        while(curr!= null){
            curr= curr.next;
            size++;
        }

        if(n== size){
            return head.next;
        }

        int IndexToSearch= size-n;
        ListNode prev= head;
        for(int i=1; i< IndexToSearch; i++){
            prev= prev.next;
        }
        prev.next= prev.next.next;
        return head;
        }
    }
