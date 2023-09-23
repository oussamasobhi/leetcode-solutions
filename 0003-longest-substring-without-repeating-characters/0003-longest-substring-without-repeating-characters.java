class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0)
         return 0;
        if(s.length()==1)
        return 1;
       int ans=-1;
       String tmp="";
       for(int j=0;j<s.length();j++){
           tmp="";
         for(int i=j;i<s.length();i++){
           if(tmp.indexOf(s.charAt(i))<0){
               tmp+=""+s.charAt(i);
                if(ans<tmp.length()){
                    ans=tmp.length();
               }
           }
           else{
               break;
           }
        }
        
    }
       return ans;
     //  return (ans<tmp.length())?tmp.length():ans;
    }
}