/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean check(List<ListNode> list,ListNode node){
        for(ListNode i: list){
            if(i==node){
                return true;
            }
        }
        return false;
    }
    public boolean hasCycle(ListNode head) {
        if(head==null)
            return false;
        ListNode cur=head;
        List<ListNode> list=new ArrayList<>();
        list.add(cur);
        cur=cur.next;
        while(cur!=null){
            if(check(list,cur)){
                return true;
            }
            else{
                list.add(cur);
                cur=cur.next;
            }
        }
        return false;
    }
}