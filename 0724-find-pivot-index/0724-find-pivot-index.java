class Solution {
    public int pivotIndex(int[] nums) {
        int leftsum=0;
        int rightsum=0;
        
        for(int i=1;i<nums.length;i++){
          rightsum+=nums[i];
        }
        for(int i=0;i<nums.length-1;i++){
            if(leftsum==rightsum)
                return i;
            else{
               
                rightsum-=nums[i+1];
                leftsum+=nums[i];
            }
        }
        if(rightsum==leftsum)
        return nums.length-1;
        else
            return -1;
    }
}