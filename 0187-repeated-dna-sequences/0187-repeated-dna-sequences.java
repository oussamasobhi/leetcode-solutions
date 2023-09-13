class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Map<String,Integer> map=new HashMap<>();
        for(int i=0;i<s.length()-9;i++){
            String str=s.substring(i,i+10);
            if(map.containsKey(str)){
                map.put(str,(Integer) map.get(str)+1);
            }
            else{
                map.put(str,1);
            }
        }
        
        List<String> arr=new ArrayList<>();
        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getValue());
            if((Integer)m.getValue()>1)
             arr.add((String)m.getKey());
        }
        return arr;
    }
}