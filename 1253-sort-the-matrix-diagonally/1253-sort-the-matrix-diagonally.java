class Solution {
    public int[][] diagonalSort(int[][] mat) {
        // my approach is to not create another matrix, ill just change the current one
        // so i iterate through the diag, store it in a list, sort it and reinsert it 
        int colindex=0;
        int lineindex=mat.length-1;
        while(lineindex>=0 && colindex<mat[0].length){
        List<Integer> tmp=new ArrayList<>();
        for(int i=lineindex , j=colindex;i<mat.length && j<mat[0].length;i++,j++){
           tmp.add(mat[i][j]);    
        }
        int k=0;
        Collections.sort(tmp);
        // place the sorted diag back
        for(int i=lineindex , j=colindex;i<mat.length && j<mat[0].length;i++,j++){
           mat[i][j]=tmp.get(k++);
        }
        if(lineindex==0) colindex++;
        if(lineindex!=0)lineindex--;
               
         }
        return mat;
    }

}