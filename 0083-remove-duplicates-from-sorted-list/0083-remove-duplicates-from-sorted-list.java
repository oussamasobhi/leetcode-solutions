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
    public ListNode deleteDuplicates(ListNode head) {
     
        if(head==null)
        {
           return head;        
        }   
        ListNode list=new ListNode();
        ListNode cur=head;
        ListNode tail=list;
        tail.next=cur;
        tail=tail.next;
        cur=cur.next;
        while(cur!=null){
            if(cur.val==tail.val){
                cur=cur.next;
                continue;
            }
            else{
                tail.next=cur;
                tail=tail.next;
                cur=cur.next;
            }
        }
        tail.next=null;
        return list.next;
    }
}