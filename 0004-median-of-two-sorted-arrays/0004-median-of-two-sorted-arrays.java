class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
      int[] n=new int[nums1.length+nums2.length];
       for(int i=0;i<nums1.length;i++){
           n[i]=nums1[i];
       }
        int k=nums1.length;
        for(int i=0;i<nums2.length;i++){
            n[k]=nums2[i];
            k++;
        }
        Arrays.sort(n);
        if(n.length%2==0){
            return ((double)n[n.length/2-1]+(double)n[n.length/2])/2;
        }
        else{
            return n[n.length/2];
        }
   
    }
}