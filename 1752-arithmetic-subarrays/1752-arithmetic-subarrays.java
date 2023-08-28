class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        // Arrays.copyOfRange(array, beg, end + 1);
        List<Boolean> ans=new ArrayList<>();
        for(int i=0;i<l.length;i++){
           ans.add(checkArithmetic(nums,l[i],r[i]));
        }
        return ans;
    }
    public boolean checkArithmetic(int[] nums,int l,int r){
        int[] arr=Arrays.copyOfRange(nums, l, r + 1);
        Arrays.sort(arr);
        int sum=arr[1]-arr[0];
        for(int i=1;i<arr.length-1;i++){
           if(sum!=arr[i+1]-arr[i])
             return false;
        }
        return true;
    }
}