class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int max=-1;
        for(int i=0;i<nums.length;i++){
            max=Math.max(nums[i]+nums[nums.length-1-i],max);
        }
        return max;
    }
}