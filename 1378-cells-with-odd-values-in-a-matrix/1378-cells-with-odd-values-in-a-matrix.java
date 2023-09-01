class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] mat=new int[m][n];
        int oddvalues=0;
        for(int i=0;i<indices.length;i++){
            for(int j=0;j<mat[0].length;j++){
                mat[indices[i][0]][j]++;
            }
            for(int j=0;j<mat.length;j++){
                mat[j][indices[i][1]]++;
            }
        }
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]%2!=0)
                oddvalues++;
            }
        }
        return oddvalues;
    }
}