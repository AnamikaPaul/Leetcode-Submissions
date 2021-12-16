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
    public ListNode reverse(ListNode head){
        if(head==null && head.next==null) return head; 
        
        ListNode prev=null; 
        ListNode curr= head;
         
        while(curr!=null)
        {
           ListNode temp= curr.next; 
           curr.next= prev;
           prev=curr; 
           curr=temp;
    
        }
    return prev;
     
        
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if( l1==null && l2==null) return null;
        else if(l1==null && l2!=null) return l2;
         else if(l1!=null && l2==null) return l1; 
        
        l1= reverse(l1);
        l2=reverse(l2);
        ListNode head= null; 
        
        int carry=0;
        while(l1!=null || l2!=null)
        {
        int sum=carry; 
        if(l1!=null) sum+=l1.val;
         if(l2!=null) sum+=l2.val;
        
        carry= sum/10;
        ListNode curr= new ListNode(sum%10);
        curr.next=head;
        head=curr;
        
        if(l1!=null) l1=l1.next;
         if(l2!=null) l2=l2.next;
                    
        }
        if(carry>0)
        {
       ListNode curr= new ListNode(carry);
        curr.next=head;
        head=curr;
        }
        
        return head;
        
        
    }
}