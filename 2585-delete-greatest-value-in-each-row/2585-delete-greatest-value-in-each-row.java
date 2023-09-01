class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int ans=0;
        for(int i=0;i<grid.length;i++){
            Arrays.sort(grid[i]);
        }
      for(int i=grid[0].length-1;i>-1;i--){
          int max=-1;
          for(int j=0;j<grid.length;j++){
              if(grid[j][i]>max)
              max=grid[j][i];
          }
          ans+=max;
      }
      return ans;
    }
}