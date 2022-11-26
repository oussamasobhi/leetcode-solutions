class Solution {
    public int countGoodRectangles(int[][] rectangles) {
       int count=0;
       int max=0;
       for(int i=0;i<rectangles.length;i++){
        int s=(rectangles[i][0]>rectangles[i][1])? rectangles[i][1]:rectangles[i][0];
          
        if(s>max){
            max=s;
            count=1;
        }
           else if(max==s){
               count++;
           }
       } 
        return count;
    }
}