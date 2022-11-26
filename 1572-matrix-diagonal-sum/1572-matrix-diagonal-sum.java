class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        int k=0;
        for(int i=0;i<mat[0].length;i++){
            for(int j=0;j<mat[i].length;j++){
                // here we take the diagonal matrix
                if(i==j){  
                    sum+=mat[i][j];
                }
                // we take here only 1 element(j) from a line(i) so in the end we have the anti diagonal matrix 
                if(j==k)
                {
                    sum+=mat[mat[i].length-i-1][j];
                     k++;
                    break;
                }
            }

        }
        int size=mat[0].length;
        // to check if size divisble by two then we return sum otherwise we retrieve the number in the middle of the matrix cause we take it two times
        if(size%2!=0){
            sum-=mat[size/2][size/2];
        }
        return sum;
    }
}