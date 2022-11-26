class Solution {
    public String interpret(String command) {
        StringBuilder s=new StringBuilder();
      //  int i=0;
        for(int i=0;i<command.length();i++){
            if(command.charAt(i)=='G'){
                s.append("G");
            }
            else if(command.charAt(i)=='('){
                if(command.charAt(i+1)==')'){
                    s.append("o");
                   i=i+1;
                }
                else if(command.charAt(i+1)=='a'){
                    s.append("al");
                    i=i+3;
                }
            }
            
        }
        return s.toString();
    }
}