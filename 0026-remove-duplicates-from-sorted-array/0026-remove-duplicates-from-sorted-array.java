class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        int k=0;
        int n=0;
        int count=0;
        boolean test=false;
        while(i<nums.length){
            System.out.println(nums[i]);
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]!=nums[j]){
                    nums[i+1]=nums[j];
                    k=j;
                    test=true;
                    count++;
                    n=nums[j];
                    break;
                }
            }
            if(!test){
                return count+1;
            }
                for(int m=i+1;m<k;m++){
                nums[m]=n;
               
        }
            i++;
            test=false;
        }
       
        return count+1;
    }
}