// https://leetcode.com/problems/add-two-numbers-ii

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
    
    public ListNode reverseList(ListNode head){
    ListNode last= null; 
    while(head!=null)
    {
        ListNode tmp=head.next; 
        head.next= last; 
        last=head;
        head=tmp; 
    }
        return last;
    } 
    
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
         l1 = reverseList(l1);
         l2 = reverseList(l2);
        
          ListNode head= null;

          int carry=0;
          while(l1!=null || l2!=null)
          {
              int sum=carry;
        
              if(l1!=null)
                  sum+=l1.val;
              
              if(l2!=null)
                 sum+= l2.val;
                  
              carry= sum/10;
 
               ListNode curr = new ListNode(sum%10);
               curr.next = head;
               head = curr;
              if(l1!=null) l1=l1.next;
      
              if(l2!=null)  l2=l2.next;
   
          }
        if(carry>0)
           {
         ListNode curr = new ListNode(carry);
            curr.next = head;
            head = curr;
        }
       
        return head;
        
    }
}