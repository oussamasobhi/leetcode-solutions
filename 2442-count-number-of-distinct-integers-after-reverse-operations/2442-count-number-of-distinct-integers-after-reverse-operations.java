class Solution {
    public int countDistinctIntegers(int[] nums) {
          Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
            Queue<Integer> s=new LinkedList<>();
            while(nums[i]>0){
                s.add(nums[i]%10);
                nums[i]=nums[i]/10;
            }
            int tmp=0;
            int size=s.size();
            int in=size-1;
            while(s.size()>0){
               tmp+=s.poll()*Math.pow(10,in);
                in--;
            }
            set.add(tmp);
        }
        return set.size();
    }
}