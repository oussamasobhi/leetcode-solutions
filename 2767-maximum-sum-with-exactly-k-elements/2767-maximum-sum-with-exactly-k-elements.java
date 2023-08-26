class Solution {
    public int maximizeSum(int[] nums, int k) {
        int score=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            max=Math.max(nums[i],max);
        }
        for(int i=0;i<k;i++){
           score+=max;
           max++;
        }
        return score;
    }
}