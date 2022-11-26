class Solution {
    public int maxProductDifference(int[] nums) {
     //   List<Integer> arr=new ArrayList<Integer>();
     Arrays.sort(nums);
     //   Collections.sort(arr);
        return (nums[nums.length-1]*nums[nums.length-2])-(nums[0]*nums[1]);
    }
}