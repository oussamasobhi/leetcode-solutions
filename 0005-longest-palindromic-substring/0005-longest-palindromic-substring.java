class Solution {
    public String longestPalindrome(String s) {
        if(s.length()==1)
        return s;
        String ans="";
        for(int i=0;i<s.length()-1;i++){
            for(int j=i;j<s.length();j++){
                String tmp=s.substring(i,j+1);
                boolean ispali=isPalindrome(tmp);
                if(ispali)
                 {
                     if(tmp.length()>ans.length())
                       ans=tmp;
                    if(ans.length()==s.length())
                      return ans;
                 }
            }
           
        }
         return ans;
    }
    boolean isPalindrome(String s){
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1))
                return false;
        }
        return true;
    } 
}