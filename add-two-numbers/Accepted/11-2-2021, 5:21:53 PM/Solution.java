// https://leetcode.com/problems/add-two-numbers

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
          ListNode dummy= new ListNode(0);
          ListNode l3=dummy;
          int carry=0;
          while(l1!=null || l2!=null)
          {
              int val=0;
              int x=0;
              int y=0;
              if(l1!=null)
                  x=l1.val;
              
              if(l2!=null)
                  y= l2.val;
                  
         
              val=carry+x+y;
              carry= val/10;
              
              //System.out.println(val);
              
              
              l3.next= new ListNode(val%10);
              
                
              l3=l3.next; 
              if(l1!=null)
                l1=l1.next;
      
              if(l2!=null)  
              l2=l2.next;
              
            
          }
        if(carry>0)
            l3.next= new ListNode(carry);
       
        return dummy.next;
        
    }
}