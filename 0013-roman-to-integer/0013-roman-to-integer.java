class Solution {
    public int romanToInt(String s) {
        int total=0;
       HashMap<String,Integer> map=new HashMap<>();
        map.put("M",1000);
        map.put("CM",900);
        map.put("D",500);
        map.put("CD",400);
        map.put("C",100);
        map.put("XC",90);
        map.put("L",50);
        map.put("XL",40);
        map.put("X",10);
        map.put("IX",9);
        map.put("IV",4);
        map.put("V",5);
        map.put("I",1);
     
        int i=0;
 
        while(i<s.length()-1){
           
           
         
           if(map.get(s.charAt(i)+"")>=map.get(s.charAt(i+1)+"")){
                total+=map.get(s.charAt(i)+"");
              
               i=i+1;
            }
            
            
            else{
                total+=map.get(s.charAt(i)+""+s.charAt(i+1));
                i=i+2;
               
            }
        }
         if(i+1==s.length()){
              total+=map.get(s.charAt(i)+"");
                 
            }        
        
       
       return total;
    }
}