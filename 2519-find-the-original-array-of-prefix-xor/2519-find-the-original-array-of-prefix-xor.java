class Solution {
    public int[] findArray(int[] pref) {
        int[] arr=new int[pref.length];
        int cumulPref=0;
        for(int i=0;i<pref.length;i++){
            arr[i]=cumulPref^pref[i];
            cumulPref^=arr[i];
        }
        return arr;
    }
}