class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=0;j<nums.length;j++){
                if(j!=i && nums[i]>nums[j])
                    sum++;
            }
            arr[i]=sum;
        }
        return arr;
    }
}