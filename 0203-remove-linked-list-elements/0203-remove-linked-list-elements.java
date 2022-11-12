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
    public ListNode removeElements(ListNode head, int val) {
       if(head==null)
           return null;
        
       ListNode cur=head;
        while(head.val==val && head.next!=null){
            head=head.next;
        }
        if(head.val==val)
            return null;
        cur=head;
       while(cur.next!=null){
           if(cur.next.val==val){
               cur.next=cur.next.next;
           }
           else{
               cur=cur.next;
           }
       }
        return head;
    }
}