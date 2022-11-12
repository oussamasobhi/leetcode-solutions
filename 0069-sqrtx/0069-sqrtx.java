class Solution {
    public int mySqrt(int x) {
         if(x==1)
             return 1;
        for(int i=1;i<x;i++){
            
            if((int)Math.pow(x,0.5)==i)
                return i;

        }
     
       return 0; 
    }
}