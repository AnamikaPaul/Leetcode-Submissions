// https://leetcode.com/problems/add-to-array-form-of-integer

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> res = new ArrayList<Integer>();
        int l=num.length-1;
        int c=0;
        int j=0;
        for(int m=l;m>=0;m--)
        {
          int i=k%10;

           j= num[m]+i+c;
          // System.out.println(j);  
           c=0;
            
           if(j>=10)
           {
               int n=j%10;
            res.add(0,n);
               c=j/10;

           }
           else
                res.add(0,j);
            
    
           l--;
           k=k/10; 
        }
     
        while(c>0 || k>0)
        {   // System.out.println("c"+c);
          
            j= (k%10)+c;
            c=0;
          // System.out.println(j);  
            if(j>=10)
           {
               int n=j%10;
              res.add(0,n);
               c=j/10;

           }
           else
                res.add(0,j);
            
         k=k/10;
        }
        
            
      
        return res;
    }
}