class Solution {
    public int[][] diagonalSort(int[][] mat) {
        // store all diagonals
        List<List<Integer>> arr=new ArrayList<>();
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
        
        arr.add(tmp);
        }
        show(arr);
        return mat;
    }
    public void show(List<List<Integer>> arr){
        for(int i=0;i<arr.size();i++)
          System.out.println(arr.get(i));
    }
}