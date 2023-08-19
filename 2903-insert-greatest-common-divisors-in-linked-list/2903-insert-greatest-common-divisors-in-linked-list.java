class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode slow=new ListNode();
       ListNode fast=new ListNode();
         slow=head;
         fast=head.next;
        while(fast!=null){
            int val=greatestDivisor(slow.val,fast.val);
            ListNode newNode=new ListNode(val);
            newNode.next=fast;
            slow.next=newNode;
            slow=fast;
            fast=fast.next;
        }
        return head;
    }
    public int greatestDivisor(int a,int b){
        if(a<b){
            for(int i=a;i>0;i--){
                if(b%i==0 && a%i==0)
                  return i;
            }
        }
        else{
            for(int i=b;i>0;i--){
                if(b%i==0 && a%i==0)
                  return i;
            } 
        }
        return 1;
    }
}