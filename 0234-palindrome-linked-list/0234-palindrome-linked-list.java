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
    public boolean isPalindrome(ListNode head) {
        List<Integer> arr=new ArrayList<>();
        ListNode cur1=head;
        while(cur1!=null){
            arr.add(cur1.val);
            cur1=cur1.next;    
        }
     for(int i=0;i<arr.size()/2;i++){
         if(arr.get(i)!=arr.get(arr.size()-i-1)){
             return false;
         }
         
     }
      return true;  
    }
}