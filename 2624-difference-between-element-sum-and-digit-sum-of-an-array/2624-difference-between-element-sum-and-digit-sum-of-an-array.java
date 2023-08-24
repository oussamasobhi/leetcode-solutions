class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        int digit=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(nums[i]<10) 
               {
               digit+=nums[i];
               continue;
               }
            while(nums[i]>0){
                int rest=nums[i]%10;
                digit+=rest;
                nums[i]/=10;
            }
        digit+=nums[i];
        }
        return Math.abs(sum-digit);
    }
}