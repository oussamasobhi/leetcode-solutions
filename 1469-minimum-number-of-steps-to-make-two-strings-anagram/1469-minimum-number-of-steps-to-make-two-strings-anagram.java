class Solution {
    public int minSteps(String s, String t) {
        Map<Character,Integer> map1=new HashMap<>();
        Map<Character,Integer> map2=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map1.containsKey(s.charAt(i))){
                 map1.put(s.charAt(i),map1.get(s.charAt(i))+1);   
            }
            else
                map1.put(s.charAt(i),1);
            if(map2.containsKey(t.charAt(i))){
                 map2.put(t.charAt(i),map2.get(t.charAt(i))+1);   
            }
            else
               map2.put(t.charAt(i),1);
        }
         int ans=0;
         for(Map.Entry m:map2.entrySet()){  
             if(!map1.containsKey(m.getKey()))
                   ans+=(Integer)m.getValue();
               else{
                   if((Integer)m.getValue()>map1.get(m.getKey()))
                       ans+=(Integer)m.getValue()-map1.get(m.getKey());
               }
        }  
        return ans;
    }
}