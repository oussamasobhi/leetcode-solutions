class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
      for(int i=0;i<score.length;i++){
         for(int j=i+1;j<score.length;j++){
            
                 if(score[j][k]>score[i][k]){
                     int[] tmp=new int[score[0].length];
                     tmp=score[j];
                     score[j]=score[i];
                     score[i]=tmp;
                 }
             
         }
      }
      return score;
    }
}