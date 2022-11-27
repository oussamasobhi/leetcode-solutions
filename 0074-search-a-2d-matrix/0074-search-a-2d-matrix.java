class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0;i<matrix.length;i++){
            int l=0,r=matrix[i].length;
            while(l<r){
                int mid=l+(r-l)/2;
                if(matrix[i][mid]==target)
                    return true;
                else if(matrix[i][mid]>target)
                    r=mid;
                else
                    l=mid+1;
            }
        }
        return false;
    }
}