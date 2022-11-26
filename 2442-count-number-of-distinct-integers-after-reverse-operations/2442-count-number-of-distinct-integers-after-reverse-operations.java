class Solution {
    public int countDistinctIntegers(int[] nums) {
          Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        //    Queue<Integer> s=new LinkedList<>();
            int cum=0;
            while(nums[i]>0){
                cum=nums[i]%10+cum*10;
                nums[i]=nums[i]/10;
            }
           
            set.add(cum);
        }
        return set.size();
    }
    
}