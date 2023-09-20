class Solution {
    public int partitionString(String s) {
        int ans=1;
        int ref=0;
        for(int i=0;i<s.length();i++){
            if(s.substring(ref,i).indexOf(s.charAt(i))!=-1){
                ans++;
                ref=i;
            }
        }
        return ans;
    }
}