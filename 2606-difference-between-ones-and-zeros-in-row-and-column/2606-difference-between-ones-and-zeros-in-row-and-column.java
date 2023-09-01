class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int[][] ans=new int[grid.length][grid[0].length];
        int[] onesrow=new int[grid.length];
        int[] onescol=new int[grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
               if(grid[i][j]==1)
               onesrow[i]++;
            }
        }
          for(int i=0;i<grid[0].length;i++){
            for(int j=0;j<grid.length;j++){
               if(grid[j][i]==1)
               onescol[i]++;
            }
        }
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                ans[i][j]=onesrow[i]+onescol[j]-(grid[i].length-onesrow[i])-(grid.length-onescol[j]);
            }
        }
        return ans;
    }
    
}