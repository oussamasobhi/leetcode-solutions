class Solution {
    public int minOperations(int[] nums) {
    int oper=0;
    int max=nums[0];
    for(int i=1;i<nums.length;i++){
       if(max<nums[i])  
         max=nums[i];
         else{
             oper+=max+1-nums[i];
             max++;
         }
    }
    return oper;
    }
}