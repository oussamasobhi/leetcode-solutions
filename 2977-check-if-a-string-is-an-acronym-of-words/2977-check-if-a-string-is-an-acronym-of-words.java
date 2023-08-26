class Solution {
    public boolean isAcronym(List<String> words, String s) {
        int index=0;
        if(words.size()!=s.length())
           return false;
        for(int i=0;i<words.size();i++){
           if(Objects.equals(words.get(i).charAt(0),
           s.charAt(index))){
               index++;
           }else{
               return false;
           }
        }
        return true;
    }
}