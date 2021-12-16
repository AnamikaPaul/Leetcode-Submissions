// https://leetcode.com/problems/3sum

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        
        for(int i=0; i<nums.length && nums[i]<=0;++i){
            if(i==0 || nums[i-1]!= nums[i]){
                twoSum(nums, i, res);
            }
        }
        return res;
    }
    
    void twoSum(int[] nums, int i, List<List<Integer>> res)
    {
        int lo=i+1, hi=nums.length-1;
        while(lo<hi)
        {
            int sum= nums[i]+nums[lo]+ nums[hi];
            if(sum<0)
                ++lo;
            else if(sum>0)
                --hi; 
            else 
            {
                res.add(Arrays.asList(nums[i], nums[lo++], nums[hi--]));
                while(lo<hi && nums[lo]==nums[lo-1])
                    ++lo;
            }
        }
    }
}