class Solution {
    public boolean areOccurrencesEqual(String s) {
        int pos=1;
        ArrayList<Integer> occur=new ArrayList<>();
        List<Character> lett=new ArrayList<>();
        
        boolean b =false;
        for(int i=0;i<s.length();i++){
              for(int m=0;m<lett.size();m++){
                if(s.charAt(i)==lett.get(m)){
                    b=true;
                    break;}
            }
            if(b){
                b=false;
                
            }
            else{
                 lett.add(s.charAt(i));
                for(int j=i+1;j<s.length();j++){
                   
                    if(s.charAt(i)==s.charAt(j)){
                        pos++;
                    }
                }
                occur.add(pos);
             
                pos=1;
            }
        }
       
        for(int i=0;i<occur.size()-1;i++){
            if(occur.get(i).equals(occur.get(i+1))){
                continue;
            }
            else{
                return false;
            }
            
        }
       return true; 
    }
}