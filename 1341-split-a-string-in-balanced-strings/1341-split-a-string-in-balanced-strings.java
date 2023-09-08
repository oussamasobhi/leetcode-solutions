class Solution {
    public int balancedStringSplit(String s) {
        int ans=0;
        int L=0;
        int R=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='L')
              L++;
            else
              R++;
            if(L==R)
              {
              ans++;
               L=0;
               R=0;
              }     
        }
        return ans;
    }
}