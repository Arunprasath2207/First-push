public /**
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
   public ListNode removeNthFromEnd(ListNode head, int n) 
   {
       ListNode moving_pointer=head;
       ListNode fast_pointer=head;
       ListNode result_pointer=head;
       int count=1;
       int start=1;
       while(fast_pointer!=null && fast_pointer.next!=null)
       {
           count++;
           fast_pointer=fast_pointer.next.next;
       }
       if(fast_pointer!=null)
       {
           count=count+(count-1);
       }
       else
       {
           count=count+(count-2);
       }
       if(count==1)
       {
           return head.next;
       }
       count=count-n;
       if(count==0)
       {
           return head.next;
       }
       System.out.println(count);
       while(start<count)
       {
           moving_pointer=moving_pointer.next;
           start++;
       }
       moving_pointer.next=moving_pointer.next.next;
       return head;
   }
} Remove_nth_node_from_last {
    
}
