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
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA== null || headB== null){
            return null;
        }
        int size1=0;
        int size2=0;
        ListNode temp1= headA;
        ListNode temp2= headB;

        while(temp1!= null){
            size1++;
            temp1= temp1.next;
        }
        while(temp2!= null){
            size2++;
            temp2= temp2.next;
        }

        temp1 = headA;
        temp2 = headB;

        if(size1> size2){
            int size= size1- size2;
            for(int i=1; i<=size; i++){
                temp1 =temp1.next;
            }
        }else{
            int size= size2- size1;
            for(int i=1; i<=size; i++){
                temp2 =temp2.next;
            }
        }

        while(temp1 != temp2){
            temp1= temp1.next;
            temp2= temp2.next;
        }
        return temp2;
    }
}
