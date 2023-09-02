class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> res=new ArrayList<>();
        Set<Integer> arr1=new HashSet<>();
        Set<Integer> arr2=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            int a=nums1[i];
            if(!IntStream.of(nums2).anyMatch(x -> x==a))
               arr1.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            int a=nums2[i];
            if(!IntStream.of(nums1).anyMatch(x -> x==a))
               arr2.add(nums2[i]);
        }
        res.add(List.copyOf(arr1));
        res.add(List.copyOf(arr2));
        return res;    
    }
}