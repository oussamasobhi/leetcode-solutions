class Solution {
   public static  int reverse( int x) {
        String fin="";
        boolean test=false;
        if(x<0){
            x=Math.abs(x);
            test=true;
        }
        String s=Integer.toString(x);    
        for(int i=0;i<s.length();i++){
           fin+=s.substring(s.length()-i-1,s.length()-i);
          
        }
       if(fin.charAt(fin.length()-1)=='-')
           fin=fin.substring(0,fin.length()-1);
       long v=Long.parseLong(fin);
       
       if(v>Integer.MAX_VALUE)
           return 0;
        if(test)
        v=v-2*v;
             
     
        return (int)v;
    }
}