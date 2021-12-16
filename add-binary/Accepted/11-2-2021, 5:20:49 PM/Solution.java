// https://leetcode.com/problems/add-binary

class Solution {
    public String addBinary(String a, String b) {
        
    StringBuilder sb= new StringBuilder();
        
    int al= a.length()-1;
    int bl=b.length()-1;
    
    int carry=0; 
  
    while(al>=0 || bl>=0 )
    {
      int sum = carry;
      if (al >= 0) 
      {    // System.out.println(a.charAt(al)-'0');
          sum =sum+ a.charAt(al--)-'0' ;
        }
          
    
   
        
      if (bl >= 0) 
      { //System.out.println(b.charAt(bl)-'0');
              sum=sum+ b.charAt(bl--)-'0'; 
      }
     
     
       sb.append(sum%2);
        carry= sum/2;    

    }
        
    if(carry!=0) sb.append(carry);
    
        return sb.reverse().toString();
    }}

 