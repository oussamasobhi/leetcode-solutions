class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
      Queue<Integer> before = new LinkedList<>();
         Queue<Integer> after = new LinkedList<>();
      List<Integer> pivots=new ArrayList<>();
      for(int i=0;i<nums.length;i++){
          if(nums[i]<pivot){
              before.add(nums[i]);

          }
          else if(nums[i]>pivot){
             after.add(nums[i]);
          }
          else{
              pivots.add(nums[i]);                   
          }
      }
      int j=0;
      int[] arr=new int[nums.length];
      for(Integer i:before){
          arr[j++]=i.intValue();
      }
          for(Integer i:pivots){
          arr[j++]=i.intValue();
      }
          for(Integer i:after){
           arr[j++]=i.intValue();
      }

       return arr;
      }
}