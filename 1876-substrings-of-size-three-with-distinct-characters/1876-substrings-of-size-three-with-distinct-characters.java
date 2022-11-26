class Solution {
    boolean good(String s){
        Set<Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            set.add(s.charAt(i));
        }
        if(set.size()!=s.length())
            return false;
        return true;
    }
    public int countGoodSubstrings(String s) {
        int count=0;
        for(int i=0;i<s.length()-2;i++){
            if(good(s.substring(i,i+3)))
                count++;
        }
        return count;
    }
}