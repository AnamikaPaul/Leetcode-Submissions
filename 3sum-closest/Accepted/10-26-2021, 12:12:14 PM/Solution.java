// https://leetcode.com/problems/3sum-closest

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int diff= Integer.MAX_VALUE;
        int sz= nums.length;
        Arrays.sort(nums);
        
        
        for(int i=0; i<sz && diff!=0;i++)
        {
            int low= i+1;
            int high= sz-1;
            while(low<high){
            int sum= nums[low]+ nums[i]+ nums[high]; 
            if(Math.abs(target-sum) < Math.abs(diff))
                diff= target-sum; 
            if(sum<target)
                ++low;
            else 
                --high;
            }
        }
        return target - diff;
    }
    
    
}