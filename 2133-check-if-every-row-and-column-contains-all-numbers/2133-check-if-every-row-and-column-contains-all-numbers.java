class Solution {
    public boolean checkValid(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            HashSet<Integer> set=new HashSet<>();
            HashSet<Integer> set2=new HashSet<>();
            for(int j=0;j<matrix[i].length;j++){
                set.add(matrix[i][j]);
                set2.add(matrix[j][i]);
            }
            
            if(set2.size()!=matrix.length || set.size()!=matrix.length)
                return false;
            else
                continue;
        }
        return true;
    }
}