class Solution {
    public int maximizeSum(int[] nums, int k) {
        int score=0;
        Arrays.sort(nums);
        for(int i=0;i<k;i++){
           score+=nums[nums.length-1];
           nums[nums.length-1]++;
        }
        return score;
    }
}