class Solution {
    public int[] executeInstructions(int n, int[] startPos, String s) {
        int[] ans=new int[s.length()];
        int[] actPos=new int[2];
        int instru=0;
        for(int i=0;i<s.length();i++){
            actPos[0]=startPos[0];
            actPos[1]=startPos[1];
             instru=0;
            for(int j=i;j<s.length();j++){
               if(s.charAt(j)=='D'){
                   if(actPos[0]+1>n-1)
                     break;
                     else{
                         actPos[0]++;
                         instru++;
                     }
               }
               else if(s.charAt(j)=='U'){
                     if(actPos[0]-1<0)
                     break;
                     else{
                         actPos[0]--;
                         instru++;
                     }
               }
               else if(s.charAt(j)=='L'){
                    if(actPos[1]-1<0)
                     break;
                     else{
                         actPos[1]--;
                         instru++;
                     }
               }
               else{
                     if(actPos[1]+1>n-1){
                     break;
                     }
                     else{
                         
                         actPos[1]++;
                         instru++;
                         
                     }
               }
               
            }
            ans[i]=instru;
        }
         return ans;
    }
}