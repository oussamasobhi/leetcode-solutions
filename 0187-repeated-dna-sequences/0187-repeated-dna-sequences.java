class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> set1=new HashSet<>();
        Set<String> set2=new HashSet<>();
        for(int i=0;i<s.length()-9;i++){
            String str=s.substring(i,i+10);
            if(!set1.add(str)){
                set2.add(str);
            }
        }
        return new ArrayList(set2);
    }
}