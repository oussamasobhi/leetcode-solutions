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
        ListNode cur1=headA;
        ListNode cur2=headB;
        int lenga=0;
        int lengb=0;
        while(cur1!=null){
            lenga++;
            cur1=cur1.next;
        }
        while(cur2!=null){
            lengb++;
            cur2=cur2.next;
        }
        cur1=headA;
        cur2=headB;
        if(lenga>lengb){
        for(int i=0;i<lenga-lengb;i++){
               cur1=cur1.next;
        }
            
        }
        else if(lengb>lenga){
            for(int i=0;i<lengb-lenga;i++){
                cur2=cur2.next;
            }
        }
        while(cur1!=null && cur2!=null){
                if(cur2==cur1){
                    return cur1;
                }
                else{
                    cur2=cur2.next;
                    cur1=cur1.next;
                }
            
        }
        return null;
    }
}