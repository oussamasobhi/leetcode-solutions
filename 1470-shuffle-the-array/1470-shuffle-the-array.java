class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr=new int[nums.length];
        int j=0;
        for(int i=0;i<nums.length-1;i=i+2){
            arr[i]=nums[j];
            j++;
        }
        j=n;
        for(int i=1;i<nums.length;i=i+2){
            arr[i]=nums[j];
            j++;
        }
        return arr;
    }
}