class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] ans=new int[A.length];
        HashSet<Integer> setA=new HashSet<>();
        HashSet<Integer> setB=new HashSet<>();
        for(int i=0;i<A.length;i++){
            setA.add(A[i]);
            setB.add(B[i]);
            HashSet<Integer> tmp=new HashSet<>(setA);
            tmp.addAll(setB);
            ans[i]=setA.size()+setB.size()-tmp.size();
        }
        return ans;
    }
}
  