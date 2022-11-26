class Solution {
    public int largestAltitude(int[] gain) {
        List<Integer> arr=new ArrayList<>();
        arr.add(0);
       int  max=0;
        for(int i=0;i<gain.length;i++){
            arr.add(arr.get(arr.size()-1)+gain[i]);
            if(max<arr.get(arr.size()-1))
                max=arr.get(arr.size()-1);
        }
   
        return max;
    }
}