class Solution {
    public int[] separateDigits(int[] nums) {
     
       List<Character> arr=new ArrayList<>();
       
       for(int i=0;i<nums.length;i++){
           String a=String.valueOf(nums[i]);
          for(int j=0;j<a.length();j++){
              arr.add(a.charAt(j));
          }    
       }
         int[] ans=new int[arr.size()];
       for(int i=0;i<arr.size();i++){
           ans[i]=Integer.parseInt(String.valueOf(arr.get(i)));
       }
       return ans;
    }
   
}