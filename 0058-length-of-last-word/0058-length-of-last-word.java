class Solution {
    public int lengthOfLastWord(String s) {
        int j=0;   
        String s1=s.trim();
         String lw="";
        for(int i=s1.length()-1;i>-1;i--){
            if(s1.charAt(i)==' '){
               j=i;  
                break;
            }     
        }
        if(j!=0)
             lw=s1.substring(j+1,s1.length());
            else
                lw=s1;
        return lw.length();
    }
}