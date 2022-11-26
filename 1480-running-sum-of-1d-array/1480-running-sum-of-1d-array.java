class Solution {
    public int[] runningSum(int[] nums) {
        int [] arr=new int[nums.length];
        int cum=0;
        for(int i=0;i<nums.length;i++){
            cum+=nums[i];
            arr[i]=cum;
        }
        return arr;
    }
}