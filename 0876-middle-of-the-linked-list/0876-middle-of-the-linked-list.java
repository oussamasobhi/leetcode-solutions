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
    public ListNode middleNode(ListNode head) {
        int lenlist=0;
        ListNode cur=head;
        while(cur!=null){
            lenlist++;
            cur=cur.next;
        }
        cur=head;
        int i=0;
        while(cur!=null && i<lenlist/2){
            cur=cur.next;
            i++;
        }
        return cur;
    }
}