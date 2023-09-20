class Solution {
    public int partitionString(String s) {
        int ans=1;
        String str="";
        for(int i=0;i<s.length();i++){
            if(str.contains(s.substring(i,i+1))){
                ans++;
                str=s.substring(i,i+1);
            }
            else{
                str+=s.substring(i,i+1);
            }
        }
        return ans;
    }
}