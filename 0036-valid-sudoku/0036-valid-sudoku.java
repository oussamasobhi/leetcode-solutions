class Solution {
    public boolean isValidSudoku(char[][] board) {
         int startrow=0;
         int startcol=0;
         int lenbox=0;
        for(int p=0;p<board.length;p=p+3)
        {
            for(int q=0;q<board.length;q=q+3){     
                HashSet<Character> set3=new HashSet<>();
                for(int k=p;k<3+p;k++){
                                          
                    for(int m=q;m<3+q;m++){
                        if(board[k][m]!='.'){
                          set3.add(board[k][m]);
                            lenbox++;
                        }
                    }
                }
                if(lenbox!=set3.size())
                    return false;
                lenbox=0;
                }
        }
         for(int i=0;i<board.length;i++){
            HashSet<Character> set=new HashSet<>();
            HashSet<Character> set2=new HashSet<>();
             
             int lenrow=0;
             int lencol=0;
                 
            for(int j=0;j<board.length;j++){
               
               if(board[i][j]!='.'){ 
                 set.add(board[i][j]);
                 lenrow++;
               }
                if(board[j][i]!='.'){
                    set2.add(board[j][i]);
                    lencol++;
                }
            }
           
            if(set2.size()!=lencol || set.size()!=lenrow)
                return false;
            else
                continue;
        }
        return true;
    }
}