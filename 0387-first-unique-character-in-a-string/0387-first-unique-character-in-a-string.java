class Solution {
    public int firstUniqChar(String s) {
        boolean test=true;
        for(int i=0;i<s.length();i++){
            test=true;
            for(int j=0;j<s.length();j++){
                if(j!=i && s.charAt(j)==s.charAt(i)){
                    test=false;
                   break;
                }
            
                }
            if(test){
                return i;
            }
            }
            return -1;
        }
        
    }
