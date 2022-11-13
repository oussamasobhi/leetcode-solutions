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
    public int getDecimalValue(ListNode head) {
        int lenlist=0;
        ListNode cur=head;
        while(cur!=null){
            lenlist++;
            cur=cur.next;
        }
        int base=0;
        cur=head;
        
        int i=lenlist-1;
        while(cur!=null){
            base+=Math.pow(2,i)*cur.val;
            System.out.println(base);
            i--;
            cur=cur.next;
        }
        return base;
    }
}