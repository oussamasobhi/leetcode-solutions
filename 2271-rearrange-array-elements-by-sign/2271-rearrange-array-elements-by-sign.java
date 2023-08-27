class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[]pos=new int[nums.length/2];
        int[]neg=new int[nums.length/2];
        int Pindex=0;
        int Nindex=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0)
               pos[Pindex++]=nums[i];
               else
               neg[Nindex++]=nums[i];
        }
        int[] ans=new int[nums.length];
        Pindex=0;
        Nindex=0;
        for(int i=0;i<ans.length;i++){
            if(i%2==0)
              ans[i]=pos[Pindex++];
              else
              ans[i]=neg[Nindex++];
              
        }
        return ans;
    }
}