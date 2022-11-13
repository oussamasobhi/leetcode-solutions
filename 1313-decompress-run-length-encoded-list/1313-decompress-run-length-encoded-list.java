class Solution {
    public int[] decompressRLElist(int[] nums) {
   
        int arrsize=0;
        for(int i=0;i<nums.length;i=i+2){
            arrsize+=nums[i];
        }
        int[] arr=new int[arrsize];
        int k=0;
         for(int i=0;i<nums.length;i=i+2){
             
             for(int j=0;j<nums[i];j++){
                 arr[k]=nums[i+1];
                 k++;
             }    
        }
        return arr;
    }
}