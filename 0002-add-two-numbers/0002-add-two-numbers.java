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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans=new ListNode();
        ListNode cur=new ListNode();
        cur=ans;
        int rest=0;
        while(l1!=null || l2!=null){
             ListNode node=new ListNode();
            int value=0;
            
            if(l1!=null && l2!=null){
               value+=l1.val+l2.val;
            }
            else if(l1!=null && l2==null){
                value+=l1.val;
            }
            else{
                value+=l2.val;
            }
            value+=rest;
            if(value>=10)
               {
                   node.val=value%10;
                   rest=1;
               }
               else{
                   node.val=value;
                   rest=0;
               }
            cur.next=node;
            cur=cur.next; 
          if(l1!=null)  l1=l1.next;
          if(l2!=null)  l2=l2.next;
        }
        if(rest!=0) 
        {
            ListNode last=new ListNode();
            last.val=1;
            cur.next=last;
        }
        return ans.next;
    }
}