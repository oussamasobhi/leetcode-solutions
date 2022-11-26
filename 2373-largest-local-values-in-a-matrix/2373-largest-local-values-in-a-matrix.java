class Solution {
    public int[][] largestLocal(int[][] grid) {
       int[][] arr=new int[grid.length-2][grid.length-2];
       for(int k=0;k<grid.length-2;k++){
        for(int m=0;m<grid.length-2;m++){
            int max=-600;
            for(int i=k;i<k+3;i++){
                
                for(int j=m;j<m+3;j++){
                    if(grid[i][j]>max)
                       max=grid[i][j];
                 
                }
             
            }
         
            arr[k][m]=max;
        }
       }
        return arr;
    }
}