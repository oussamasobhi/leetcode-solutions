class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
      int sum=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                int max1=max(grid[i]);
                int max2=maxcol(grid,j);
                 sum+= (max1>max2)?(max2-grid[i][j]):(max1-grid[i][j]);
            }
        }
        return sum;
    }
    public int max(int[] ar){
        int max=-1;
        for(int i=0;i<ar.length;i++){
            if(ar[i]>max)
                max=ar[i];
        }
        return max;
    }
    public int maxcol(int[][] grid,int j){
        int max=-1;
        for(int i=0;i<grid.length;i++){
            if(grid[i][j]>max)
                max=grid[i][j];
        }
        return max;
    }
}