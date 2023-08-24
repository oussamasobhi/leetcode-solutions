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
            while(nums[i]>=10){
                int a=nums[i]/(int)Math.pow(10,String.valueOf(nums[i]).length()-1);
                nums[i]-=a*Math.pow(10,String.valueOf(nums[i]).length()-1);
                digit+=a;
            }
        digit+=nums[i];
        }
        return Math.abs(sum-digit);
    }
}