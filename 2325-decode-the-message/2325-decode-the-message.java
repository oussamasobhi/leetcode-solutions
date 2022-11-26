class Solution {
    public String decodeMessage(String key, String message) {
       HashMap<Character,Character> map=new HashMap<>();
       int j=97;
        for(int i=0;i<key.length();i++){         
            if(key.charAt(i)!=' ' && !map.containsKey(key.charAt(i))){
            map.put(key.charAt(i),(char)(j++));
            
            }
           
       }
        StringBuilder s=new StringBuilder();
       for(int i=0;i<message.length();i++){
           if(message.charAt(i)!=' ')
            s.append(map.get(message.charAt(i)));
         else
            s.append(" ");
        }
   
        return s.toString();
    }
}