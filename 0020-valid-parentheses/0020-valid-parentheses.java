class Solution {
    public boolean isValid(String s) {
      Stack<Character> q=new Stack<>();
        q.add(s.charAt(0));
        HashMap<Character,Character> map=new HashMap<>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)=='('|| s.charAt(i)=='[' ||s.charAt(i)=='{'){
                q.push(s.charAt(i));
            }
            else{
                if(q.size()==0){
                    q.push(s.charAt(i));
                    continue;
                }
                if(q.peek()==map.get(s.charAt(i))){
                    
                    q.pop();
                }
                else{
                    q.push(s.charAt(i));
                }
            }
        }
        
        return (q.size()==0)? true:false;
    }
}