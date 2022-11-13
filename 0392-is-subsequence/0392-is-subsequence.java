class Solution {
    int index=-1;
   
    public boolean isSubsequence(String s, String t) {
        for(int i=0;i<s.length();i++){
            
            if(!check(s.charAt(i),t)){
                
                return false;
            }
        }
        
        return true;
    }
     public boolean check(char c,String a){
        for(int i=index+1;i<a.length();i++){
            if(c==a.charAt(i)){
             index=i;
                return true;
            }
            index=i+1;
        }
        
        return false;
    }
}