class Solution {
    public int[][] diagonalSort(int[][] mat) {
        // my approach is to not create another array and change the current matix
        int colindex=0;
        int lineindex=mat.length-1;
        while(lineindex>=0 && colindex<mat[0].length){
        List<Integer> tmp=new ArrayList<>();
        for(int i=lineindex , j=colindex;i<mat.length && j<mat[0].length;i++,j++){
           tmp.add(mat[i][j]);
               
        }
        int k=0;
        Collections.sort(tmp);
        for(int i=lineindex , j=colindex;i<mat.length && j<mat[0].length;i++,j++){
           mat[i][j]=tmp.get(k++);
        }
        if(lineindex==0) colindex++;
        if(lineindex!=0)lineindex--;
               
         }
        return mat;
    }

}