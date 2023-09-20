class Solution {
    public int partitionString(String s) {
        List<String> arr=new ArrayList<>();
        String str="";
        for(int i=0;i<s.length();i++){
            
          System.out.println(str.contains(s.substring(i,i+1)));
            if(str.contains(s.substring(i,i+1))){
                arr.add(str);
                str=s.substring(i,i+1);
            }
            else{
                str+=s.substring(i,i+1);
            }
            
        }
        return arr.size()+1;
    }
}