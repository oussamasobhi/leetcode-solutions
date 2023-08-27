class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] ans=new int[nums.length];
        int Pindex=0;
        int Nindex=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
             ans[Pindex]=nums[i];
             Pindex+=2;
            }
            else{
            ans[Nindex]=nums[i];
             Nindex+=2;
            }
        }
        return ans;
    }
}