// https://leetcode.com/problems/add-strings

class Solution {
    public String addStrings(String num1, String num2) {
        
 StringBuilder sb= new StringBuilder();
        
    int al= num1.length()-1;
    int bl=num2.length()-1;
    
    int carry=0; 
  
    while(al>=0 || bl>=0 )
    {
      int sum = carry;
      if (al >= 0) 
          sum =sum+ num1.charAt(al--) -'0' ;
      if (bl >= 0) 
          sum=sum + num2.charAt(bl--)-'0';

       sb.append(sum%10);
        carry= sum/10;  
        

    }
        
    if(carry!=0) sb.append(carry);
    
        return sb.reverse().toString();
    }}
