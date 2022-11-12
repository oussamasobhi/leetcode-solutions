class Solution {
    public int searchInsert(int[] nums, int target) {
        int p=0;
      
        for(int i=0;i<nums.length;i++){
            if(target>nums[i])
                    p=i+1;
            
            if(nums[i]==target)
                return i;
            
        }
    return p;
            
    }
}